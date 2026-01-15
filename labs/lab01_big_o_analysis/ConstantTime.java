public class ConstantTime {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 5; // Accessing the 6th element (0-based index)

        long startTime = System.nanoTime();
        int value = array[index]; // O(1) operation
        long endTime = System.nanoTime();

        System.out.println("Value at index " + index + ": " + value);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // Question: Why is this O(1)? Because it takes the same time regardless of array size.
    }
}