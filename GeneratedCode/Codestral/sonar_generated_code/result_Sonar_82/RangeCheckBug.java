class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);

        // Unreachable while loop added here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }

        return Math.max(UPPER, result);
    }

    // Method to always return false
    private boolean getCondition() {
        return false;
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}