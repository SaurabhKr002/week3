package challengeproblem.filewordcounter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "D:\\CapgBcackUps\\week3_backup\\day4_backup\\src\\challengeproblem\\filewordcounter\\challenge.txt";

        // The word to repeat in the file
        String word = "hello";

        // Define the target file size (100MB in bytes)
        long targetFileSize = 100L * 1024 * 1024; // 100MB in bytes
        long currentFileSize = 0;

        // Create the file object
        File file = new File(filePath);

        // Start writing to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            while (currentFileSize < targetFileSize) {
                // Write the word 'hello' followed by a space to the file
                String textToWrite = word + " ";
                writer.write(textToWrite);
                currentFileSize += textToWrite.length();

                // Periodically add a sentence to vary the content
                if (currentFileSize % (10 * 1024) == 0) {
                    writer.write("This is a sentence with some extra words to ensure variety. ");
                    currentFileSize += "This is a sentence with some extra words to ensure variety. ".length();
                }
            }

            System.out.println("File generated successfully at " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
