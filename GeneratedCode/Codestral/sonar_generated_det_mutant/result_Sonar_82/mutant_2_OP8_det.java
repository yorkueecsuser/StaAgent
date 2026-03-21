class BuggyRangeCheck {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int jwbyirqh = Math.min(LOWER, num); // Noncompliant; Bug: Min and max used in combination should not always return the same value
        return Math.max(UPPER, jwbyirqh);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}