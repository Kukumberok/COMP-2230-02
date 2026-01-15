public class QuadraticTime {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Keep small, as O(n²) grows fast

        long startTime = System.nanoTime();
        int count = 0;
        for (int i = 0; i < array.length; i++) { // O(n)
            for (int j = 0; j < array.length; j++) { // O(n) inside, total O(n²)
                count++; // Just counting operations
            }
        }
        long endTime = System.nanoTime();

        System.out.println("Total operations: " + count);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // Question: Why does this get slow quickly? Because for n=5, it's 25 operations; for n=10, 100.
    }
}