package 아이템42;

import java.util.function.DoubleBinaryOperator;

/**
 * packageName    : 아이템42
 * fileName       : Main
 * author         : ipeac
 * date           : 24. 6. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 6. 19.        ipeac       최초 생성
 */
public class Main {
    public static void main(String[] args) {
    
    }
    
    public enum Operation {
        PLUS("+", (x, y) -> x + y),
        MINUS("-", (x, y) -> x - y),
        TIMES("*", (x, y) -> x * y),
        DIVIDE("/", (x, y) -> x / y);
        
        private final String symbol;
        private final DoubleBinaryOperator op;
        
        Operation(String symbol, DoubleBinaryOperator op) {
            this.symbol = symbol;
            this.op = op;
        }
        
        public double apply(double x, double y) {
            return op.applyAsDouble(x, y);
        }
    }
}