class RangeChecker {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    public int showBug(int num) {
        // Insert unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case will never be true
                System.out.println("Unreachable code block");
                break;
            default:
                break;
        }

        return doRangeCheck(num);
    }
    
    private int getUnreachableValue() {
        // Returns a value that will not match the switch case
        return -1;
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
    }
}