package 아이템17;

import java.math.BigInteger;

/**
 * packageName    : 아이템17
 * fileName       : BigIntegerTest
 * author         : ipeac
 * date           : 24. 5. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 30.        ipeac       최초 생성
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("123456789012345678901234567890");
        bigInteger.negate();
    }
}