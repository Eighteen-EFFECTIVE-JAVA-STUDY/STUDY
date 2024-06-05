package 아이템25;

/**
 * packageName    : 아이템25
 * fileName       : Mai
 * author         : sjunpark
 * date           : 24. 6. 5.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 6. 5.        sjunpark       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Dessert.NAME + " with " + Utensil.NAME);
    }
    
    private static class Utensil {
        static final String NAME = "pan";
    }
    
    private static class Dessert {
        static final String NAME = "cake";
    }
}