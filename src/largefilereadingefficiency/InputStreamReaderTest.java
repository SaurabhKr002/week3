package largefilereadingefficiency;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public void readFile(String filePath) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {
            while (reader.read() != -1) {
                // Reading byte by byte and converting to character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
