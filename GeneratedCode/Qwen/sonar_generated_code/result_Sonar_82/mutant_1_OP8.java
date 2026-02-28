class RangeChecker {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    // Mutated code with renaming of variable'result' to 'x'
    public int doRangeCheckMutant(int num) {    // Let's say num = 12
        int x = Math.min(LOWER, num);  // x = 0
        return Math.max(UPPER, x);     // BUG: Min and max used in combination should not always return the same value
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public int showBugMutant(int num) {
        return doRangeCheckMutant(num);
    }

    public static void main(String[] args) {
        RangeChecker checker = new RangeChecker();
        System.out.println(checker.showBug(12)); // This will print 20, demonstrating the bug
        System.out.println(checker.showBugMutant(12)); // This will also print 20, demonstrating the bug in mutant
    }
}