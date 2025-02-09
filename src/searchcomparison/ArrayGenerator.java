package searchcomparison;

import java.util.Random;

// ArrayGenerator
public class ArrayGenerator {
    public static int[] generateArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size * 10); // Generate random numbers within a range
        }
        return arr;
    }
}