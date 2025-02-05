package challengeproblem.filewordcounter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileWordCounter {

    public static void main(String[] args) {
        // Specify the path of the 100MB file
        String filePath = "D:\\CapgBcackUps\\week3_backup\\day4_backup\\src\\challengeproblem\\filewordcounter\\challenge.txt";

        // Count the number of words and measure time taken for FileReader
        long startTimeFileReader = System.nanoTime();
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        long endTimeFileReader = System.nanoTime();

        // Print separate output for word count using FileReader
        System.out.println("Word count using FileReader: " + wordCountFileReader);

        // Print separate output for time taken by FileReader
        System.out.println("Time taken by FileReader: " + (endTimeFileReader - startTimeFileReader) / 1_000_000 + " ms");

        // Count the number of words and measure time taken for InputStreamReader
        long startTimeInputStreamReader = System.nanoTime();
        int wordCountInputStreamReader = countWordsUsingInputStreamReader(filePath);
        long endTimeInputStreamReader = System.nanoTime();

        // Print separate output for word count using InputStreamReader
        System.out.println("Word count using InputStreamReader: " + wordCountInputStreamReader);

        // Print separate output for time taken by InputStreamReader
        System.out.println("Time taken by InputStreamReader: " + (endTimeInputStreamReader - startTimeInputStreamReader) / 1_000_000 + " ms");
    }

    // Function to count words using FileReader
    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words based on whitespace characters and count them
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return wordCount;
    }

    // Function to count words using InputStreamReader
    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words based on whitespace characters and count them
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return wordCount;
    }
}
