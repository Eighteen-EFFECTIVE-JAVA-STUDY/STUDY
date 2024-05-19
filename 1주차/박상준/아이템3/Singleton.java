package 아이템3;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    // 유일한 인스턴스를 저장할 정적 필드
    private static final Singleton INSTANCE = new Singleton();

    // private 생성자
    private Singleton() {
        // private으로 생성자를 만들어 외부에서 인스턴스를 생성하지 못하게 함
    }

    // 인스턴스를 반환하는 public 메서드
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // 직렬화 중에 호출되는 메서드
    private Object readResolve() {
        return INSTANCE;
    }
}