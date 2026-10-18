public class Member {
    private int memberId;
    private String memberName;
    private int borrowedBookCount;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowedBookCount = 0;
    }

    void displayMemberDetails(){
        System.out.println("MemberID: "+memberId);
        System.out.println("Member Name: "+memberName);
        System.out.println("Borrowed Book Count: "+borrowedBookCount);
    }

    void borrowBook(){
        borrowedBookCount = borrowedBookCount+1;
    }

    void returnBook(){
        if (borrowedBookCount>0){
            borrowedBookCount = borrowedBookCount -1;
        }
    }
}
