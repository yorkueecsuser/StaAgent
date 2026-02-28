class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}

// Unreachable switch statement mutation
class MinMaxBugMutant {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        switch (false) {  // Unreachable switch statement mutation
            case 1:
                return Math.max(LOWER, result);
            default:
                return result;
        }
    }

    public static void main(String[] args) {
        MinMaxBugMutant buggy = new MinMaxBugMutant();
        System.out.println(buggy.doRangeCheck(12)); // prints 12
    }
}