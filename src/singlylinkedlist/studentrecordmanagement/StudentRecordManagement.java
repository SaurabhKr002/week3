package singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        int choice;

        do {
            System.out.println("\n1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Display All Records");
            System.out.println("7. Update Grade");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade = sc.next().charAt(0);
                    list.addAtBeginning(rollNumber, name, age, grade);
                }
                case 2 -> {
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade = sc.next().charAt(0);
                    list.addAtEnd(rollNumber, name, age, grade);
                }
                case 3 -> {
                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade = sc.next().charAt(0);
                    list.addAtPosition(position, rollNumber, name, age, grade);
                }
                case 4 -> {
                    System.out.print("Enter Roll Number to Delete: ");
                    int rollNumber = sc.nextInt();
                    list.deleteByRollNumber(rollNumber);
                }
                case 5 -> {
                    System.out.print("Enter Roll Number to Search: ");
                    int rollNumber = sc.nextInt();
                    list.searchByRollNumber(rollNumber);
                }
                case 6 -> list.displayAll();
                case 7 -> {
                    System.out.print("Enter Roll Number to Update Grade: ");
                    int rollNumber = sc.nextInt();
                    System.out.print("Enter New Grade: ");
                    char newGrade = sc.next().charAt(0);
                    list.updateGrade(rollNumber, newGrade);
                }
                case 8 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}
