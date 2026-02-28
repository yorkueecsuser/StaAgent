class RepeatedConditionalTestBug {
    private int getFalseValue() {
        return -1;
    }

    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        boolean buggyCondition = x == 0 || x == 0;

        // Mutant: Unreachable switch statement
        int falseValue = getFalseValue();
        switch (falseValue) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code");
                break;
            default:
                // This is the default case
                break;
        }

        return buggyCondition;
    }
}