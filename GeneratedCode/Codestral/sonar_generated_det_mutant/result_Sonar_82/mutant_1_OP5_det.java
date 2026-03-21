class BuggyRangeCheck {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int gqefxymg = 0;switch  (gqefxymg) {case 1:long qimhpypr = 709697921;break;default:long kojbwlnj = 221979764;break;}
        int result = Math.min(LOWER, num); // Noncompliant; Bug: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);
    
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}