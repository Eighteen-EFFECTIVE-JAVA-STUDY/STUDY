package 아이템46;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

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
        Map<String, Suit> stringToEnum = Suit.stringToEnum;
        System.out.println("stringToEnum = " + stringToEnum);
    }
    
    enum Suit {
        CLUB("클럽"),
        DIAMOND("다이아몬드"),
        HEART("하트"),
        SPADE("스페이드");
        
        public final String description;
        
        Suit(String description) {
            this.description = description;
        }
        
        private static final Map<String, Suit> stringToEnum =
                Stream.of(values()).collect(toMap(Object::toString, e -> e));
        
    }
}