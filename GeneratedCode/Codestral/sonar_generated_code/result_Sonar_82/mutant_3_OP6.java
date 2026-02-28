class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    private boolean getCondition() {
        return false;
    }

    public int doRangeCheck(int num) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Mutation: Unreachable for loop
            System.out.println("This code is unreachable.");
        }

        int result = Math.min(LOWER, num);
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}