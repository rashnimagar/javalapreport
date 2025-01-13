package ClassesConstructor;

class Book{
    String bookName;
    String authorName;
    double price;

    //constroctor
    public Book(String bookName, String authorName, double price){
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }
    public void display(){
        System.out.println("Book name: " + bookName);
        System.out.println("Author name: " + authorName);
        System.out.println("Book price: " + price);
    }
}
public class BookStore {
    public static void main(String[] args) {
        //creating a new object for Book class
        Book book = new Book("Harry Potter", "J.K. Rowling", 750.50);
        book.display();
    }
}
