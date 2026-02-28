class RangeChecker {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
    }
}

// Mutant code using Renaming mutation operator
class RangeCheckerMutant {

    private static final int a = 20;  // 'UPPER' renamed to 'a'
    private static final int b = 0;   // 'LOWER' renamed to 'b'

    public int doRangeCheck(int c) {  // 'num' renamed to 'c'
        int d = Math.min(b, c);       // 'result' renamed to 'd'
        return Math.max(a, d);
    }

    public int showBug(int e) {       // 'num' renamed to 'e'
        return doRangeCheck(e);
    }

    public static void main(String[] args) {
        RangeCheckerMutant rangeCheckerMutant = new RangeCheckerMutant();
        int f = rangeCheckerMutant.showBug(12);  // 'result' renamed to 'f'
        System.out.println("Result: " + f);      // Expected within range, but will print 20 due to bug
    }
}