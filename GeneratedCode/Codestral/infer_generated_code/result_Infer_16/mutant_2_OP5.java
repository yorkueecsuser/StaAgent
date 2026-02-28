class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1

        // Mutant code: Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should not be executed");
                    break;
            }
        }

        return m;
    }

    private boolean getCondition() {
        // This method returns a false value to ensure the switch statement is unreachable
        return false;
    }
}