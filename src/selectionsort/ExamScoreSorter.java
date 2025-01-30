package selectionsort;

// ExamScoreSorter.java
import java.util.Arrays;

public class ExamScoreSorter {
    // Method to perform Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // Traverse the array to find the minimum element in each iteration
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first unsorted element is the minimum

            // Find the minimum element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Main method to test Selection Sort
    public static void main(String[] args) {
        int[] examScores = {85, 72, 90, 60, 95, 88, 76};

        System.out.println("Original Exam Scores: " + Arrays.toString(examScores));

        // Sorting exam scores using Selection Sort
        selectionSort(examScores);

        System.out.println("Sorted Exam Scores: " + Arrays.toString(examScores));
    }
}
