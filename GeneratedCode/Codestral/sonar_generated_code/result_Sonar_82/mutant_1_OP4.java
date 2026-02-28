class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    private boolean getUnreachableCondition() {
        return false;
    }

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        if (getUnreachableCondition()) {
            // Unreachable if-else statement mutant
            result = Integer.MIN_VALUE;
        } else {
            result = Math.max(UPPER, result);
        }
        return result;
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}