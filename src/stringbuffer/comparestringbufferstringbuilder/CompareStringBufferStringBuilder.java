package stringbuffer.comparestringbufferstringbuilder;

public class CompareStringBufferStringBuilder {
    private static final int ITERATIONS = 1000000;
    private static final String TEXT = "hello";

    // Measures execution time for StringBuffer
    private static long measureStringBuffer() {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Measures execution time for StringBuilder
    private static long measureStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Main method to execute the performance comparison
    public static void main(String[] args) {
        long stringBufferTime = measureStringBuffer();
        long stringBuilderTime = measureStringBuilder();

        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " ns");
    }
}

