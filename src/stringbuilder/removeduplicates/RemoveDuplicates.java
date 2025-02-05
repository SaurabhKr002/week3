package stringbuilder.removeduplicates;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    // Removes duplicate characters while maintaining the original order
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            // If the character is not already seen, append it to the result
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c); // Mark the character as seen
            }
        }
        return sb.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicates and display the result
        System.out.println("String without duplicates: " + removeDuplicates(input));

        scanner.close();
    }
}
