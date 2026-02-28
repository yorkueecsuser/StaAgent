class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        while (isFalse()) {} // Mutant: Unreachable while loop
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    private boolean isFalse() {
        return false; // This method ensures that the while loop is unreachable
    }
}