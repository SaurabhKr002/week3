package bubblesort;

// StudentMarksSorter.java
import java.util.Arrays;

public class StudentMarksSorter {
    // Method to perform Bubble Sort on student marks
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap if the left element is greater than the right
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true; // Mark swap as done
                }
            }

            // If no swaps occurred in this pass, the array is sorted
            if (!swapped) break;
        }
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int[] studentMarks = {85, 72, 90, 60, 95, 88, 76};

        System.out.println("Original Marks: " + Arrays.toString(studentMarks));

        // Sorting the marks using Bubble Sort
        bubbleSort(studentMarks);

        System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
    }
}
