package 아이템34;

/**
 * packageName    : 아이템34
 * fileName       : Main
 * author         : ipeac
 * date           : 24. 6. 9.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 6. 9.        ipeac       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(PayrollDay.MONDAY.pay(10, 100));
        System.out.println(PayrollDay.SATURDAY.pay(10, 100));
    }
}