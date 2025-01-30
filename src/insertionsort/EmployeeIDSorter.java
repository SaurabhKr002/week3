package insertionsort;

// EmployeeIDSorter.java
import java.util.Arrays;

public class EmployeeIDSorter {
    // Method to perform Insertion Sort on employee IDs
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;

        // Iterate through the array, considering one element at a time
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i]; // Current element to be placed correctly
            int j = i - 1;

            // Shift elements of the sorted part to the right if they are greater than key
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j]; // Shift element right
                j--;
            }

            // Insert key at the correct position
            employeeIDs[j + 1] = key;
        }
    }

    // Main method to test the sorting function
    public static void main(String[] args) {
        int[] employeeIDs = {103, 101, 108, 102, 105, 107};

        System.out.println("Original Employee IDs: " + Arrays.toString(employeeIDs));

        // Sorting employee IDs using Insertion Sort
        insertionSort(employeeIDs);

        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }
}
