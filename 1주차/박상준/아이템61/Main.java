package 아이템61;

/**
 * packageName    : 아이템61
 * fileName       : Main
 * author         : ipeac
 * date           : 24. 7. 5.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 7. 5.        ipeac       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // 래퍼 클래스 Long 사용
        long startTime1 = System.currentTimeMillis();
        Long sumObject = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sumObject += i;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Long 결과: " + sumObject);
        System.out.println("Long 실행 시간: " + (endTime1 - startTime1) + "ms");
        
        // 기본 타입 long 사용
        long startTime2 = System.currentTimeMillis();
        long sumPrimitive = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sumPrimitive += i;
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("long 결과: " + sumPrimitive);
        System.out.println("long 실행 시간: " + (endTime2 - startTime2) + "ms");
        Long.valueOf(1L);
    }
}