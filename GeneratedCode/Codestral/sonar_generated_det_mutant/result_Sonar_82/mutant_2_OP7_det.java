class BuggyRangeCheck {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        boolean dzkvnlvl = false;while (dzkvnlvl && false && true && false && false && true && false && true && false && true && true && false) {double yehpkdnl = 443473711;}
        int result = Math.min(LOWER, num); // Noncompliant; Bug: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);
    
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}