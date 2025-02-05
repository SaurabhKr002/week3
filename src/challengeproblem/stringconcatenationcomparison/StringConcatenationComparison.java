package challengeproblem.stringconcatenationcomparison;

import java.util.ArrayList;
import java.util.List;

public class StringConcatenationComparison {

    public static void main(String[] args) {
        // Create a list of strings (e.g., "hello")
        List<String> strings = new ArrayList<>();
        strings.add("hello");

        // Number of times to concatenate
        int times = 1000000;

        // StringBuilder Concatenation Test
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            for (String str : strings) {
                stringBuilder.append(str);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder took: " + (endTime - startTime) / 1_000_000 + " ms");

        // StringBuffer Concatenation Test
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < times; i++) {
            for (String str : strings) {
                stringBuffer.append(str);
            }
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer took: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

