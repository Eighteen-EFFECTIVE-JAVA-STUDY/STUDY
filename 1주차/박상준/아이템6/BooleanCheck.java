package 아이템6;

/**
 * packageName    : 아이템6
 * fileName       : BooleanCheck
 * author         : ipeac
 * date           : 24. 5. 21.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 21.        ipeac       최초 생성
 */
public class BooleanCheck {

    public static void main(String[] args) {
        Boolean a = new Boolean(true);
        Boolean d = new Boolean(true);

        Boolean b = Boolean.valueOf(true);
        Boolean c = Boolean.valueOf(true);

        System.out.println(a == d); // false
        System.out.println(b == c); // true
    }
}