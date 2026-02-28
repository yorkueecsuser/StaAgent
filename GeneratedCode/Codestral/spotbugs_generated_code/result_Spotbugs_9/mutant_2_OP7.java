class RepeatedConditionalTestBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        while (getFalseCondition()) { // Unreachable while loop
            // This code will never be executed
        }
        return x == 0 || x == 0;
    }
}