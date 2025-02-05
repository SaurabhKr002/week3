package binarysearch.peakelementfinder;

public class PeakElementFinder {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is greater than the next element, peak is in the left half
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else { // Otherwise, peak is in the right half
                left = mid + 1;
            }
        }

        // The left index will point to a peak element
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0}; // Example input
        int peakIndex = findPeakElement(arr);
        System.out.println("A peak element is at index: " + peakIndex);
    }
}

