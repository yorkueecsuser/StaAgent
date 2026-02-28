class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        boolean unreachableCondition = false; // Always false to make the branch unreachable
        if (unreachableCondition) {
            int unreachableResult = num + 1;
            return unreachableResult;
        } else {
            int result = Math.min(LOWER, num);
            return Math.max(UPPER, result);
        }
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}