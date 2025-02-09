package fibonacciComparison;

public class PerformanceTester {
    public static void runTests() {
        System.out.println("Comparing Recursive vs Iterative Fibonacci:");
        System.out.println("--------------------------------------------");

        runPerformanceTest(10);
        runPerformanceTest(30);
        runPerformanceTest(50);
    }

    private static void runPerformanceTest(int n) {
        long recursiveTime = -1;
        long iterativeTime;

        if (n <= 40) {
            long start = System.nanoTime();
            FibonacciCalculator.recursive(n);
            recursiveTime = System.nanoTime() - start;
        }

        long start = System.nanoTime();
        FibonacciCalculator.iterative(n);
        iterativeTime = System.nanoTime() - start;

        if (n > 40) {
            System.out.printf("Fibonacci(%d) | Recursive: Unfeasible | Iterative: %d ns%n", n, iterativeTime);
        } else {
            System.out.printf("Fibonacci(%d) | Recursive: %d ns | Iterative: %d ns%n", n, recursiveTime, iterativeTime);
        }
    }
}
