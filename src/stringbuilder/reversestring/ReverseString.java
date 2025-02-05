package stringbuilder.reversestring;
import java.util.Scanner;

public class ReverseString {
    // Reverses a string using StringBuilder
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        System.out.println("Reversed String: " + reverseString(input));

        scanner.close();
    }
}
