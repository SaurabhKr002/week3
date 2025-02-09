package sortcomparison;

import java.util.Arrays;

// SortingComparison
public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            int[] data = ArrayGenerator.generateArray(size);

            int[] arr1 = Arrays.copyOf(data, data.length);
            long startTime = System.nanoTime();
            BubbleSort.sort(arr1);
            long bubbleTime = System.nanoTime() - startTime;

            int[] arr2 = Arrays.copyOf(data, data.length);
            startTime = System.nanoTime();
            MergeSort.sort(arr2);
            long mergeTime = System.nanoTime() - startTime;

            int[] arr3 = Arrays.copyOf(data, data.length);
            startTime = System.nanoTime();
            QuickSort.sort(arr3, 0, arr3.length - 1);
            long quickTime = System.nanoTime() - startTime;

            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time: " + (bubbleTime > 3.6e12 ? ">1 hour" : bubbleTime / 1e6 + " ms"));
            System.out.println("Merge Sort Time: " + mergeTime / 1e6 + " ms");
            System.out.println("Quick Sort Time: " + quickTime / 1e6 + " ms");
            System.out.println("-----------------------------------");
        }
    }
}
