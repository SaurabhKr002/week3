package doublylinkedlist.librarymanagementsystem;

class LibraryManagement {
    private Book head;
    private Book tail;

    // Add a book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        System.out.println("Book added at the beginning.");
    }

    // Add a book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        System.out.println("Book added at the end.");
    }

    // Add a book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (position == 1) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        Book temp = head;
        int currentPosition = 1;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            System.out.println("Invalid position. Adding at the end.");
            addBookAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newBook;
            } else {
                tail = newBook;
            }
            temp.next = newBook;
            newBook.prev = temp;
            System.out.println("Book added at position " + position + ".");
        }
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                System.out.println("Book with ID " + bookId + " removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Search for a book by Title or Author
    public void searchBook(String title, String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book Found: ID: " + temp.bookId + ", Title: " + temp.title +
                        ", Author: " + temp.author + ", Genre: " + temp.genre +
                        ", Available: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No book found with the specified title or author.");
        }
    }

    // Update a book's availability status
    public void updateBookAvailability(int bookId, boolean isAvailable) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                System.out.println("Updated availability status for book with ID " + bookId + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in Forward Order:");
        Book temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + ", Title: " + temp.title +
                    ", Author: " + temp.author + ", Genre: " + temp.genre +
                    ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in Reverse Order:");
        Book temp = tail;
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + ", Title: " + temp.title +
                    ", Author: " + temp.author + ", Genre: " + temp.genre +
                    ", Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count the total number of books
    public int countBooks() {
        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
