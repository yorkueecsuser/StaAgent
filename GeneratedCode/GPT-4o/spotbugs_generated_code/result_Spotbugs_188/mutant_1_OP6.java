class MutableArrayExample {

    // This is a mutable array that is public and static
    public static final int[] numbers = {1, 2, 3, 4, 5}; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void showBug() {
        // Modifying the array contents from a different method
        numbers[0] = 99;  // This demonstrates how the array can be altered

        // Inserting an unreachable for loop
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed due to unreachable condition.");
        }
    }

    public static int[] getNumbers() {
        return numbers;
    }

    // Helper method to provide a condition for the unreachable loop
    private static boolean getUnreachableCondition() {
        return false; // Always false making the loop unreachable
    }

    public static void main(String[] args) {
        System.out.println("Original array:");
        for (int number : getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Demonstrating the bug by calling showBug
        showBug();

        System.out.println("Modified array:");
        for (int number : getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}