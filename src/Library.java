import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {

    }

    void addBook(Book book){
        books.add(book);
    }

    void displayAllBooks(){
        if (books.isEmpty()){
            System.out.println("No books in the library.");
        }else {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                book.displayBookDetails();
            }
        }
    }

    void borrowBook(int bookId, Member member){
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getBookId() == bookId){
                if (book.isAvailable()){
                    book.setAvailable(false);
                    member.borrowBook();
                    System.out.println("Book borrowed successfully!");
                }else {
                    System.out.println("Book is already borrowed!");
                }
                System.out.println("Book found!");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Book not found!");
        }
    }

    void returnBook(int bookId, Member member){
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getBookId() == bookId){
                found = true;
                if (!book.isAvailable()){
                    book.setAvailable(true);
                    member.returnBook();
                    System.out.println("Book returned successfully!");
                    return;
                }else {
                    System.out.println("This book was not borrowed!");
                }

            }

        }
        if (!found) {
            System.out.println("Book not found!");
        }

    }
}
