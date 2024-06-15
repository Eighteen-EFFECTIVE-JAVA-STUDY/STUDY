package 아이템46;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * packageName    : 아이템46
 * fileName       : Main
 * author         : ipeac
 * date           : 24. 6. 15.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 6. 15.        ipeac       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // 단어 목록을 리스트로 생성
        List<String> wordList = Arrays.asList("apple", "BANANA", "apple", "banana", "apple", "banana", "apple", "banana", "apple", "banana");
        
        // 리스트를 스트림으로 변환
        Stream<String> words = wordList.stream();
        
        Map<String, Long> anagrams = words.collect(
                groupingBy(String::toLowerCase, TreeMap::new, counting())
        );
        
        anagrams.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }
}