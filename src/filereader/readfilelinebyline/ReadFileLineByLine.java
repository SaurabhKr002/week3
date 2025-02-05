package filereader.readfilelinebyline;

import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "D:\\CapgBcackUps\\week3_backup\\day4_backup\\src\\filereader\\readfilelinebyline\\hello.txt";

        // Try-with-resources ensures the file is closed automatically
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
