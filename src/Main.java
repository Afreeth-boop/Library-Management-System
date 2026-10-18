import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Library library = new Library();

        library.addBook(new Book(1, "Maths", "Affu"));
        library.addBook(new Book(2, "English", "Ashu"));

        Member member = new Member(101, "Afreeth");

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Display all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Display member details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter book ID to borrow: ");
                    int borrowId = in.nextInt();
                    library.borrowBook(borrowId, member);
                    break;

                case 3:
                    System.out.print("Enter book ID to return: ");
                    int returnId = in.nextInt();
                    library.returnBook(returnId, member);
                    break;

                case 4:
                    member.displayMemberDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using the Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1 to 5.");
            }

        } while (choice != 5);

        in.close();
    }
}