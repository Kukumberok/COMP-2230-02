public class LinearTime {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Try with larger arrays, e.g., 1000 elements

        long startTime = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // O(n) loop
            sum += array[i];
        }
        long endTime = System.nanoTime();

        System.out.println("Sum of array: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // Question: How does time change if you double the array size?
    }
}