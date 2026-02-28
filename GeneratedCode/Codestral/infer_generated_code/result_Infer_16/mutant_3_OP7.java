class IntegerOverflowL1 {
    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}