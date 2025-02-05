package binarysearch.challengeproblem;

import java.util.Arrays;

public class ChallengeSearch {

    // Function to find the first missing positive number using Linear Search
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        //Place each number at its correct index if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1] (putting numbers in correct positions)
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        //Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // Missing number found
            }
        }

        return n + 1; // If all numbers are present, return the next positive integer
    }

    // Function to find the index of a target using Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1, 7, 2, 5};
        int target = 5;

        // Finding the first missing positive integer
        int missingPositive = findFirstMissingPositive(numbers);
        System.out.println("First missing positive integer: " + missingPositive);

        // Sorting the array for Binary Search
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Finding the index of the target using Binary Search
        int targetIndex = binarySearch(numbers, target);
        System.out.println("Index of target " + target + ": " + targetIndex);
    }
}
