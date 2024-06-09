package 아이템34;

/**
 * packageName    : 아이템34
 * fileName       : Member
 * author         : ipeac
 * date           : 24. 6. 9.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 6. 9.        ipeac       최초 생성
 */
public class Member {
    private int memberId;
    private MemberType memberType;
    
    private enum MemberType {
        ADMIN("ADMIN"), USER("USER");
        
        private String memberType;
        
        MemberType(String memberType) {
            this.memberType = memberType;
        }
        
        public String getMemberType() {
            return memberType;
        }
    }
}