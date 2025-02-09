package searchcomparison;

import java.util.Arrays;

// SearchComparison
public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000}; // Dataset sizes
        int target = 5000; // Random target value

        for (int size : sizes) {
            int[] data = ArrayGenerator.generateArray(size);

            long startTime = System.nanoTime();
            LinearSearch.search(data, target);
            long linearTime = System.nanoTime() - startTime;

            Arrays.sort(data);
            startTime = System.nanoTime();
            BinarySearch.search(data, target);
            long binaryTime = System.nanoTime() - startTime;

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime / 1e6 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1e6 + " ms");
            System.out.println("-----------------------------------");
        }
    }
}