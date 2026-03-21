class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // Original buggy code
        boolean result = x == 0 || x == 0;

        // Unreachable while loop mutation
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }

        return result;
    }
}