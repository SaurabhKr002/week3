package doublylinkedlist.librarymanagementsystem;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Specific Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search Book by Title or Author");
            System.out.println("6. Update Book Availability");
            System.out.println("7. Display Books in Forward Order");
            System.out.println("8. Display Books in Reverse Order");
            System.out.println("9. Count Total Books");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Author: ");
                    String author = sc.next();
                    System.out.print("Enter Genre: ");
                    String genre = sc.next();
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter Availability (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    library.addBookAtBeginning(title, author, genre, bookId, isAvailable);
                }
                case 2 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Author: ");
                    String author = sc.next();
                    System.out.print("Enter Genre: ");
                    String genre = sc.next();
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter Availability (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    library.addBookAtEnd(title, author, genre, bookId, isAvailable);
                }
                case 3 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Author: ");
                    String author = sc.next();
                    System.out.print("Enter Genre: ");
                    String genre = sc.next();
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter Availability (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();
                    library.addBookAtPosition(title, author, genre, bookId, isAvailable, position);
                }
                case 4 -> {
                    System.out.print("Enter Book ID to Remove: ");
                    int bookId = sc.nextInt();
                    library.removeBookById(bookId);
                }
                case 5 -> {
                    System.out.print("Enter Title (or press enter to skip): ");
                    String title = sc.next();
                    System.out.print("Enter Author (or press enter to skip): ");
                    String author = sc.next();
                    library.searchBook(title, author);
                }
                case 6 -> {
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter Availability (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    library.updateBookAvailability(bookId, isAvailable);
                }
                case 7 -> library.displayForward();
                case 8 -> library.displayReverse();
                case 9 -> System.out.println("Total Books: " + library.countBooks());
                case 10 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 10);

        sc.close();
    }
}