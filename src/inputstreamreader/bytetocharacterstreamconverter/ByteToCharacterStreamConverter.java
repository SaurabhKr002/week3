package inputstreamreader.bytetocharacterstreamconverter;

import java.io.*;

public class ByteToCharacterStreamConverter {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "D:\\CapgBcackUps\\week3_backup\\day4_backup\\src\\inputstreamreader\\bytetocharacterstreamconverter\\hello.txt";

        // Try-with-resources ensures resources are closed automatically
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

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
