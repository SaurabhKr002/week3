package filereader.CountWordOccurrence;

import java.io.*;

public class CountWordOccurrence {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "D:\\CapgBcackUps\\week3_backup\\day4_backup\\src\\filereader\\CountWordOccurrence\\hello.txt";

        // Word to count occurrences of
        String targetWord = "hello"; // Specify the target word to count
        int count = 0;

        // Try-with-resources ensures the file is closed automatically
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+"); // Split by whitespace

                // Check each word in the line
                for (String word : words) {
                    // Remove any non-alphabetic characters and trim spaces
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    // Increment the count if the word matches the target word
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            // Print the final count of occurrences
            System.out.println("The word '" + targetWord + "' occurred " + count + " times.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
