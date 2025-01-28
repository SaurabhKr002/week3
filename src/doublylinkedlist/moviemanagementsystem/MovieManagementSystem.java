package doublylinkedlist.moviemanagementsystem;

import java.util.Scanner;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieManagement movieManagement = new MovieManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Specific Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search Movie by Director or Rating");
            System.out.println("6. Display Movies in Forward Order");
            System.out.println("7. Display Movies in Reverse Order");
            System.out.println("8. Update Movie Rating");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Director: ");
                    String director = sc.next();
                    System.out.print("Enter Year of Release: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    movieManagement.addMovieAtBeginning(title, director, year, rating);
                }
                case 2 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Director: ");
                    String director = sc.next();
                    System.out.print("Enter Year of Release: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    movieManagement.addMovieAtEnd(title, director, year, rating);
                }
                case 3 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Director: ");
                    String director = sc.next();
                    System.out.print("Enter Year of Release: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();
                    movieManagement.addMovieAtPosition(title, director, year, rating, position);
                }
                case 4 -> {
                    System.out.print("Enter Movie Title to Remove: ");
                    String title = sc.next();
                    movieManagement.removeMovieByTitle(title);
                }
                case 5 -> {
                    System.out.print("Enter Director (or press enter to skip): ");
                    String director = sc.next();
                    System.out.print("Enter Rating (or -1 to skip): ");
                    double rating = sc.nextDouble();
                    movieManagement.searchMovie(director, rating);
                }
                case 6 -> movieManagement.displayForward();
                case 7 -> movieManagement.displayReverse();
                case 8 -> {
                    System.out.print("Enter Movie Title: ");
                    String title = sc.next();
                    System.out.print("Enter New Rating: ");
                    double newRating = sc.nextDouble();
                    movieManagement.updateMovieRating(title, newRating);
                }
                case 9 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}