package binarysearch.firstlastoccurrence;

public class FirstLastOccurrenceFinder {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;  // Possible first occurrence
                right = mid - 1;    // Search in left half
            } else if (arr[mid] > target) {
                right = mid - 1;    // Search in left half
            } else {
                left = mid + 1;     // Search in right half
            }
        }
        return firstIndex;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastIndex = mid;   // Possible last occurrence
                left = mid + 1;    // Search in right half
            } else if (arr[mid] > target) {
                right = mid - 1;   // Search in left half
            } else {
                left = mid + 1;    // Search in right half
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6};
        int target = 2;

        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        System.out.println("First occurrence of " + target + ": " + first);
        System.out.println("Last occurrence of " + target + ": " + last);
    }
}
