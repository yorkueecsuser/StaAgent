class ArrayLengthBugDemo {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = showBug(numbers, 10); // Attempting to access out of bounds length
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int length) {
        int sum = 0;
        boolean condition = getCondition(); // Use a method call to ensure it's not a compile-time constant
        if (condition) {
            // This block is unreachable
            System.out.println("This code is not reachable");
        } else {
            for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
                sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
            }
        }
        return sum;
    }

    // Helper method to provide a dynamic condition
    public static boolean getCondition() {
        return false;
    }
}