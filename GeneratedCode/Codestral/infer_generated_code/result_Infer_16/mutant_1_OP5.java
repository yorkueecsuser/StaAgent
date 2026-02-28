class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1

        // Mutant code: unreachable switch statement
        boolean condition = getFalseCondition();
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
                default:
                    // This code will never be executed
                    System.out.println("Default unreachable code");
            }
        }

        return m;
    }

    // This method is used to get a false condition
    private boolean getFalseCondition() {
        return false;
    }

    // This method is used to get a value for the switch statement
    private int getValue() {
        return 0;
    }
}