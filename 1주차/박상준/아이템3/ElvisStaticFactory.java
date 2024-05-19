package 아이템3;

/**
 * packageName    : 아이템3
 * fileName       : ElvisStaticFactory
 * author         : ipeac
 * date           : 24. 5. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 19.        ipeac       최초 생성
 */
public class ElvisStaticFactory {
    private static final ElvisStaticFactory INSTANCE = new ElvisStaticFactory();

    private ElvisStaticFactory() {
    }

    public static ElvisStaticFactory getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
    }
}