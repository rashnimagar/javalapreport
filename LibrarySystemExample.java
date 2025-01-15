package OOPsPrinciples;

//using encapsulation method to demonstrate LibrarySystem Example
class Library{
    private int bookCount;
    public Library(int count){
        this.bookCount = count;
    }
    //getter for book count
    public int getBookCount() {
        return bookCount;
    }
    //setter to update book count
    public void addBooks(int count){
        if(count>0){
            bookCount += count;
        }
    }
    public void issueBook() {
        if(bookCount>0){
            bookCount--;
            System.out.println("Book issued. Remaining books: " + bookCount);
        }else{
            System.out.println("No books available to issue.");
        }
    }
}
public class LibrarySystemExample {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.issueBook();
        library.addBooks(5);
        System.out.println("Total books in library: " + library.getBookCount());
    }
}
