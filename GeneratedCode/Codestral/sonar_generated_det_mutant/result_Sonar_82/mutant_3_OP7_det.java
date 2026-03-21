class BuggyRangeCheck {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        boolean fhhtjqjz = false;while (fhhtjqjz && false && false && true && true && true && false && true && true && true && true && false) {short uukpxjic = -4020;}
        int result = Math.min(LOWER, num); // Noncompliant; Bug: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);
    
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}