class IntegerOverflowL1 {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;

        // Added unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never execute.");
        }

        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}