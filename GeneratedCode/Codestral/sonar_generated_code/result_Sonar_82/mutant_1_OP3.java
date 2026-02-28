class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        // Mutant code block
        if (getUnreachableCondition()) {
            // This block is unreachable as getUnreachableCondition() always returns false
            int unreachableVar = 10;
        }
        return Math.max(UPPER, result);
    }

    // Method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}