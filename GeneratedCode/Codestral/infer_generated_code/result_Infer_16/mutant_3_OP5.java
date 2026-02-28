class IntegerOverflowL1 {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1

        // Mutant: Unreachable switch statement
        boolean shouldRunSwitch = getFalseCondition();
        if (shouldRunSwitch) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This code will never be executed.");
                    break;
            }
        }

        return m;
    }
}