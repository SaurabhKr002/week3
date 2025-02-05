package binarysearch.matrixsearch;

public class MatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols; // Convert 1D index to row
            int col = mid % cols; // Convert 1D index to column
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true; // Target found
            } else if (target < midValue) {
                right = mid - 1; // Search left half
            } else {
                left = mid + 1; // Search right half
            }
        }
        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;

        boolean result = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);
    }
}
