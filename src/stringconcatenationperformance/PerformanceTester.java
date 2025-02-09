package stringconcatenationperformance;

public class PerformanceTester {
    private static final int SMALL = 1_000;
    private static final int MEDIUM = 10_000;
    private static final int LARGE = 1_000_000;

    public void runTests() {
        System.out.println("Operations Count (N) | String (O(N²)) | StringBuilder (O(N)) | StringBuffer (O(N))");
        System.out.println("-------------------------------------------------------------");
        testPerformance(SMALL);
        testPerformance(MEDIUM);
        testPerformance(LARGE);
    }

    private void testPerformance(int size) {
        System.out.print(size + " | ");

        long start = System.nanoTime();
        new StringConcatenation().testString(size);
        System.out.print((size == LARGE ? "Unusable" : timeElapsed(start)) + " | ");

        start = System.nanoTime();
        new StringBuilderConcatenation().testStringBuilder(size);
        System.out.print(timeElapsed(start) + " | ");

        start = System.nanoTime();
        new StringBufferConcatenation().testStringBuffer(size);
        System.out.println(timeElapsed(start));
    }

    private String timeElapsed(long start) {
        return (System.nanoTime() - start) / 1_000_000 + "ms";
    }
}
