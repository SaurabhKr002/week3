package linearsearch;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        // Sample array
        int[] array = {3, 5, -2, 8, 4, -1, 7};

        // Call the function to search for the first negative number
        int index = findFirstNegative(array);

        // Print the result in the desired format
        if (index != -1) {
            System.out.println("The first negative number is at index: " + index);
        } else {
            System.out.println(index); // If no negative number, print -1
        }
    }

    // Function to find the first negative number using Linear Search
    public static int findFirstNegative(int[] array) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is negative
            if (array[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        // Return -1 if no negative number is found
        return -1;
    }
}
