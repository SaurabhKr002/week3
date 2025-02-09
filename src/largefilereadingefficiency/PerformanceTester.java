package largefilereadingefficiency;

public class PerformanceTester {
    private final String filePath;

    public PerformanceTester(String filePath) {
        this.filePath = filePath;
    }

    public void runTests() {
        System.out.println("FileReader Time | InputStreamReader Time");
        System.out.println("---------------------------------------------");

        testPerformance();
    }

    private void testPerformance() {
        long start = System.nanoTime();
        new FileReaderTest().readFile(filePath);
        System.out.print(timeElapsed(start) + " | ");

        start = System.nanoTime();
        new InputStreamReaderTest().readFile(filePath);
        System.out.println(timeElapsed(start));
    }

    private String timeElapsed(long start) {
        return (System.nanoTime() - start) / 1_000_000 + "ms";
    }
}
