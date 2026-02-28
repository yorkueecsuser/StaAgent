class IntegerOverflowL1 {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;
        if (getFalseCondition()) {
            System.out.println("This line should never be executed");
        }
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}