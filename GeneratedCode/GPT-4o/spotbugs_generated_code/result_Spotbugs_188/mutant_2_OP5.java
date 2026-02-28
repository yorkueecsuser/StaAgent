class MutableArrayExample {

    // This is a mutable array that is public and static
    public static final int[] numbers = {1, 2, 3, 4, 5}; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void showBug() {
        // Modifying the array contents from a different method
        numbers[0] = 99;  // This demonstrates how the array can be altered
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

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // Ensures dynamic evaluation
        switch (unreachableValue) {
            case 100:
                System.out.println("This code will never be executed.");
                break;
            default:
                // Default case is required to ensure no compilation error
                break;
        }
    }

    // Method to provide a dynamic value for the switch
    public static int getUnreachableValue() {
        return 0; // Ensures the switch case is unreachable
    }
}