class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int r = Math.min(LOWER, num);  // Mutant: Renaming'result' to 'r'
        return Math.max(UPPER, r);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}