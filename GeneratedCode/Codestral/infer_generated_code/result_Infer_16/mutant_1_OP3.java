class IntegerOverflowL1 {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;
        if (getUnreachableCondition()) {
            System.out.println("This branch is unreachable");
        }
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}