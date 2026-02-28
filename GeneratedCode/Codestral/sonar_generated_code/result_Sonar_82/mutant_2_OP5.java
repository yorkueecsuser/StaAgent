class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    private static int getConstant() {
        return 0; // This method always returns 0 to make the condition in the switch statement always false
    }

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        result = Math.max(UPPER, result);

        int constant = getConstant();
        switch (constant) {
            case 1:
                // This case is unreachable because constant is always 0
                System.out.println("Unreachable code executed.");
                break;
            default:
                // The default case will always be executed
                break;
        }

        return result;
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}