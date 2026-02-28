class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            return x == 0; // unreachable code
        }
        return x == 0 || x == 0;
    }

    private boolean getCondition() {
        return false;
    }
}