package binarysearch.rotationpointfinder;

public class RotationPointFinder {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than rightmost element, search right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Else, search the left half
            else {
                right = mid;
            }
        }

        return left; // Index of the smallest element (rotation point)
    }

    public static void main(String[] args) {
        int[] rotatedArray = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };

        int rotationPointIndex = findRotationPoint(rotatedArray);
        System.out.println("The rotation point is at index: " + rotationPointIndex);
    }
}
