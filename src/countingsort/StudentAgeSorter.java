package countingsort;

// StudentAgeSorter.java
import java.util.Arrays;

public class StudentAgeSorter {
    // Method to perform Counting Sort
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1; // Determine the range of ages
        int[] count = new int[range]; // Count array
        int[] output = new int[ages.length]; // Output array

        // Step 1: Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in the correct position in the output array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--; // Decrease the count
        }

        // Step 4: Copy the sorted output back to the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    // Main method to test Counting Sort
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 14, 12, 16, 13, 17, 10, 15};

        System.out.println("Original Student Ages: " + Arrays.toString(studentAges));

        // Sorting student ages using Counting Sort
        countingSort(studentAges, 10, 18);

        System.out.println("Sorted Student Ages: " + Arrays.toString(studentAges));
    }
}

