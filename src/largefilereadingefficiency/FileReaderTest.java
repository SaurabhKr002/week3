package largefilereadingefficiency;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public void readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            while (reader.read() != -1) {
                // Reading character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
