package inputstreamreader.writetofile;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        // Specify the file to write user input
        String filePath = "D:\\CapgBcackUps\\week3_backup\\day4_backup\\src\\inputstreamreader\\writetofile\\hello.txt";

        // Try-with-resources ensures resources are closed automatically
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath)) {

            String userInput;
            System.out.println("Enter text to save to file (type 'exit' to stop):");

            // Read user input line by line
            while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(userInput + "\n"); // Write input to file
            }

            System.out.println("User input has been saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error handling file: " + e.getMessage());
        }
    }
}

