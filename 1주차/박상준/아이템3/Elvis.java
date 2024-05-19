package 아이템3;

public class Elvis {
    //Elvis.INSTANCE 를 초기화시에 `private` 생성자아 딱 한 번만 호출되어 인스턴스가 하나만 생서됨을 보증할 수 있다.
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
    }
}