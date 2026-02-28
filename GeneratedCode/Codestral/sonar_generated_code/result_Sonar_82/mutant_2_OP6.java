class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        boolean conditionFor = getCondition(); // Added method call to get dynamic condition
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("Unreachable code"); // Added unreachable statement
        }
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    private boolean getCondition() { // Method to dynamically generate condition
        return false;
    }
}