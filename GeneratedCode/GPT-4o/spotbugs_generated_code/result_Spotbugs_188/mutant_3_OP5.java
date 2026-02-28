class MutableArrayExample {

    // This is a mutable array that is public and static
    public static final int[] numbers = {1, 2, 3, 4, 5}; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void showBug() {
        // Modifying the array contents from a different method
        numbers[0] = 99;  // This demonstrates how the array can be altered

        // Unreachable switch statement inserted
        int value = getUnreachableValue(); // This method returns a value that makes the switch statement unreachable
        switch (value) {
            case 99:
                System.out.println("This case is unreachable.");
                break;
            default:
                // No operation here to avoid unreachable statement error.
                break;
        }
    }

    public static int[] getNumbers() {
        return numbers;
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

    // This method returns a value that makes the switch case unreachable
    private static int getUnreachableValue() {
        return 0; // Ensures the case 99 in showBug method will never be executed
    }
}