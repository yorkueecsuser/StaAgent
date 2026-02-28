class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        // Duplication Operator: Duplicating the assignment statement and insert immediately after its current location
        int duplicateResult = Math.min(LOWER, num);
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}