package quicksort;

// ProductPriceSorter.java
import java.util.Arrays;

public class ProductPriceSorter {
    // Method to perform Quick Sort
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method to place pivot at its correct position
    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Choosing last element as pivot
        int i = low - 1; // Index of smaller element

        // Traverse the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap pivot element to its correct position
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Main method to test Quick Sort
    public static void main(String[] args) {
        double[] productPrices = {1299.99, 499.50, 899.75, 299.99, 750.25, 199.99};

        System.out.println("Original Product Prices: " + Arrays.toString(productPrices));

        // Sorting product prices using Quick Sort
        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));
    }
}
