package 아이템11;

import java.util.Comparator;
import java.util.Objects;

/**
 * packageName    : 아이템11
 * fileName       : Main
 * author         : sjunpark
 * date           : 24. 5. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 30.        sjunpark       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber("010", 1234, 5678);

        PhoneNumber p2 = new PhoneNumber("010", 4567, 5678);

        System.out.println(p1.compareTo(p2));
    }

    static class PhoneNumber implements Comparable<PhoneNumber> {
        private String key;

        private int num;

        private int num2;

        private static final Comparator<PhoneNumber> COMPARATOR =
                Comparator.comparing((PhoneNumber pn) -> pn.key)
                        .thenComparing(pn -> pn.num)
                        .thenComparing(pn -> pn.num2);

        public PhoneNumber(String key, int num, int num2) {
            this.key = key;
            this.num = num;
            this.num2 = num2;
        }

        @Override
        public int compareTo(PhoneNumber o) {
            return COMPARATOR.compare(this, o);
        }

        @Override
        public final boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PhoneNumber that)) return false;

            return num == that.num && num2 == that.num2 && Objects.equals(key, that.key);
        }

        @Override
        public int hashCode() {
            int result = Objects.hashCode(key);
            result = 31 * result + num;
            result = 31 * result + num2;
            return result;
        }
    }
}