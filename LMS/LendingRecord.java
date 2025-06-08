package LMS;
///  this class stores the data that which book was issued by which member
public class LendingRecord {
    String recordId;
    Book book;
    Member member;
    String issueDate;
    String dueDate;
    String returnDate;

    public LendingRecord(String recordId,Book book,Member member,String issueDate,String dueDate){
        this.recordId=recordId;
        this.book=book;
        this.member=member;
        this.issueDate=issueDate;
        this.dueDate=dueDate;
        this.returnDate=null;
    }

    /// this method will set the return date of book today
    public void returnBook(){
        this.returnDate=java.time.LocalDate.now().toString();
        book.returnBook();;
    }



}