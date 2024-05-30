package 아이템10;

import java.util.regex.Pattern;

/**
 * packageName    : 아이템10
 * fileName       : Main
 * author         : sjunpark
 * date           : 24. 5. 23.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 23.        sjunpark       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.equals(new Object());

        Pattern a = Pattern.compile("a");
        Pattern b = Pattern.compile("a");

        System.out.println(a.equals(b));
    }
}