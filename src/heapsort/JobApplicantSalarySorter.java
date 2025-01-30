package heapsort;

// JobApplicantSalarySorter.java
import java.util.Arrays;

public class JobApplicantSalarySorter {
    // Method to perform Heap Sort
    public static void heapSort(double[] salaries) {
        int n = salaries.length;

        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max element) with the last element
            double temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to heapify a subtree rooted at node 'i' in a heap of size 'n'
    private static void heapify(double[] salaries, int n, int i) {
        int largest = i; // Assume root is the largest
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index

        // Check if left child exists and is greater than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check if right child exists and is greater than current largest
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If the largest is not root, swap and continue heapifying
        if (largest != i) {
            double temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }

    // Main method to test Heap Sort
    public static void main(String[] args) {
        double[] salaryDemands = {55000, 72000, 45000, 60000, 80000, 50000};

        System.out.println("Original Salary Demands: " + Arrays.toString(salaryDemands));

        // Sorting salary demands using Heap Sort
        heapSort(salaryDemands);

        System.out.println("Sorted Salary Demands: " + Arrays.toString(salaryDemands));
    }
}

