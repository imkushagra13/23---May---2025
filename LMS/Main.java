package LMS;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// Create Book and Members and store in Repository
        Repository<Book> bookRepo=new Repository<>();
        Repository<Member> memberRepo=new Repository<>();
        ArrayList<LendingRecord> lendingRecords=new ArrayList<>();

        /// Add books
        bookRepo.add("B111",new Book("B111","Art of Letting Go","Nick Trenton"));
        bookRepo.add("B102",new Book("B102","Sita-the Warrior of Mithila","Amish Tripathi"));
        bookRepo.add("B132",new Book("B132","Happiness","Sri Sri RaviShankar"));

        /// Add Members
        memberRepo.add("M101",new Member("M101","Naman","naman@yahoo.com"));
        memberRepo.add("M102",new Member("M102","Gargi","gargi@hotmail.com"));
        memberRepo.add("M103",new Member("M103","Madhvi","madhvi@gmail.com"));

        try{
            /// issue a book to a member
                Book bookToIssue=bookRepo.get("B132");
                bookToIssue.issue();
                lendingRecords.add(new LendingRecord("B132",bookToIssue,memberRepo.get("M101"),"2025-06-02","2025-06-10"));

                /// displaying issued book records
                lendingRecords.stream().map(record -> record.book.title)
                        .forEach(System.out::println);

        }catch (BookNotAvailableException | MemberNotFoundException e){
            System.out.println("Error "+e.getMessage());
        }

        /// Start the thread
        new Overdue(lendingRecords).start();
    }
}