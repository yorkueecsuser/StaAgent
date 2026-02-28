class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;

        // Inserting unreachable while loop
        boolean conditionWhile = false; // Always false to make the loop unreachable
        while (conditionWhile) {
            // This block will never execute
            System.out.println("Unreachable code");
        }

        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}