class RepeatedConditionalTestBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int x) {
        // Original bug: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        if (getFalseCondition()) {
            // Unreachable if-else statement mutation
            return x == 0; // This line will never be executed
        } else {
            return x == 0 || x == 0;
        }
    }
}