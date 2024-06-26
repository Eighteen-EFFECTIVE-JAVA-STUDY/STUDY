package 아이템17;

/**
 * packageName    : 아이템17
 * fileName       : Complex
 * author         : sjunpark
 * date           : 24. 5. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 30.        sjunpark       최초 생성
 */
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public static void main(String[] args) {
        Complex com = new Complex(1, 2).minus(new Complex(3, 4));
        System.out.println(com.re + " " + com.im);
    }
}