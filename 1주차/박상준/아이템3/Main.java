package 아이템3;

import java.io.*;

/**
 * packageName    : 아이템3
 * fileName       : Main
 * author         : ipeac
 * date           : 24. 5. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 19.        ipeac       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        try {
            // 싱글턴 객체를 파일에 직렬화
            Singleton instance1 = Singleton.getInstance();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.java"));
            out.writeObject(instance1);
            out.close();

            // 파일에서 싱글턴 객체를 역직렬화
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.java"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            // 두 객체가 동일한지 확인
            System.out.println(instance1 == instance2); // true 출력
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}