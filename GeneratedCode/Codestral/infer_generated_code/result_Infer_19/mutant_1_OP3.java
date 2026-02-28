class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        // Original code
        int result = x + y;

        // Mutant code: Unreachable if statement
        if (isUnreachableCondition()) {
            // This block is unreachable
            System.out.println("This line will never be executed.");
        }

        return result;
    }

    // Method that always returns false
    private static boolean isUnreachableCondition() {
        return false;
    }
}