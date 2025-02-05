package stringbuffer.concatenatestrings;

import java.util.Scanner;

public class ConcatenateStrings {
    // Concatenates an array of strings efficiently using StringBuffer
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();

        // Append each string to StringBuffer
        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Concatenate and display result
        System.out.println("Concatenated String: " + concatenateStrings(strings));

        scanner.close();
    }
}
