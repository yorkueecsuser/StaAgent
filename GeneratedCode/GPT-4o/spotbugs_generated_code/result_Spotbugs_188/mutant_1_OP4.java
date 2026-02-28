class MutableArrayExample {

    // This is a mutable array that is public and static
    public static final int[] numbers = {1, 2, 3, 4, 5}; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void showBug() {
        // Modifying the array contents from a different method
        numbers[0] = 99;  // This demonstrates how the array can be altered

        // Inserting unreachable if-else branch
        boolean condition = isConditionTrue();
        if (condition) {
            System.out.println("This won't be printed.");
        } else {
            // This else block is always executed because condition is always false
            System.out.println("Inserted unreachable if-else branch.");
        }
    }

    public static int[] getNumbers() {
        return numbers;
    }

    public static boolean isConditionTrue() {
        return false;  // The condition is always false making the if-else branch unreachable
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