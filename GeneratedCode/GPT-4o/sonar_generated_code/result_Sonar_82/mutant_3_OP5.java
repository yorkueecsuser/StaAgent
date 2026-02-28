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

    private int getUnreachableSwitchValue() {
        return 999;  // This value will not match any case in the switch statement
    }

    public void unreachableSwitchExample() {
        int switchValue = getUnreachableSwitchValue();
        switch (switchValue) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                // No action needed, ensuring the switch is unreachable
                break;
        }
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
        
        rangeChecker.unreachableSwitchExample(); // This will not print anything due to unreachable switch cases
    }
}