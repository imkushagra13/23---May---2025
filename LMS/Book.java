package LMS;
///this class represent that a book is in the library

public class Book implements Comparable<Book> {
    String bookId;
    String title;
    String author;
    boolean isIssued;

    /// made a constrctor to fill values  in this member variables;
    Book(String bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isIssued=false;
    }

    ///now check whether book is issued or not
    public void issue() throws BookNotAvailableException {
        if(isIssued){
            throw new BookNotAvailableException("Book is Already Issued");
        }
        isIssued=true;
    }

    ///return book
    public void returnBook(){
        isIssued=false;
    }

    /// this is used to sort the books in alphabetical order
    @Override
    public int compareTo(Book obj){
        return this.title.compareTo(obj.title);
    }

}
/// this class in extending the exception class for making our own exception
class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String message){
        super(message);
    }
}

