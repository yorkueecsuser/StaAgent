class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        int duplicatedResult = result; // added this line to duplicate the assignment statement
        return Math.max(UPPER, duplicatedResult);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}