
public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    void displayBookDetails(){
        System.out.println("book's ID: "+bookId );
        System.out.println("title: "+ title);
        System.out.println("author: "+author);
        System.out.println("Availability: "+available);
    }

    boolean isAvailable(){
        return available;
    }

    void setAvailable(boolean available){
        this.available = available;
    }

    int getBookId(){
        return bookId;

    }


}
