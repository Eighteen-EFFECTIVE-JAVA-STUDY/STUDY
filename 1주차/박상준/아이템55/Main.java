package 아이템55;

import java.util.*;
import java.util.stream.Stream;

/**
 * packageName    : 아이템55
 * fileName       : Main
 * author         : ipeac
 * date           : 24. 6. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 6. 26.        ipeac       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // 샘플 데이터 생성
        List<Optional<String>> streamOfOptionals = Arrays.asList(
                Optional.of("Hello"),
                Optional.empty(),
                Optional.of("World"),
                Optional.ofNullable(null),
                Optional.of("Java")
        );
        
        // Java 8 방식
        System.out.println("Java 8 방식:");
        Stream<String> resultJava8 = streamOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get);
        
        resultJava8.forEach(System.out::println);
        
        // Java 9 이후 방식
        System.out.println("\nJava 9 이후 방식:");
        Stream<String> resultJava9 = streamOfOptionals.stream()
                .flatMap(Optional::stream);
        
        resultJava9.forEach(System.out::println);
    }
    
    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }
}