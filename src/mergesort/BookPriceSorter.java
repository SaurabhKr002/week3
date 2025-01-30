package mergesort;

// BookPriceSorter.java
import java.util.Arrays;

public class BookPriceSorter {
    // Method to perform Merge Sort
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle index

            // Recursively divide the array into two halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    private static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;  // Size of left subarray
        int n2 = right - mid;      // Size of right subarray

        // Temporary arrays
        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from leftArray (if any)
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements from rightArray (if any)
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main method to test Merge Sort
    public static void main(String[] args) {
        double[] bookPrices = {499.99, 149.50, 899.75, 299.99, 750.25, 199.99};

        System.out.println("Original Book Prices: " + Arrays.toString(bookPrices));

        // Sorting book prices using Merge Sort
        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrices));
    }
}
