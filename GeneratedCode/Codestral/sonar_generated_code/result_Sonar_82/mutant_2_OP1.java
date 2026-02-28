class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;
    private static final int DEADSTORE = 10; // added for Dead Store mutant

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        int deadstoreVariable = DEADSTORE; // added and unused for Dead Store mutant
        return doRangeCheck(num);
    }
}