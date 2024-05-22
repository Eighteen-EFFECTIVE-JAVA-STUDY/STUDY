package 아이템7;

/**
 * packageName    : 아이템7
 * fileName       : Main
 * author         : sjunpark
 * date           : 24. 5. 22.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 22.        sjunpark       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("hello");
        stack.push("world");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}