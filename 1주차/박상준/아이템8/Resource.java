package 아이템8;

/**
 * packageName    : 아이템8
 * fileName       : Resource
 * author         : sjunpark
 * date           : 24. 5. 23.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 23.        sjunpark       최초 생성
 */
public class Resource {
    @Override
    protected void finalize() throws Throwable {
        try {
            // 자원 해제 코드
        } finally {
            super.finalize();
        }
    }
}