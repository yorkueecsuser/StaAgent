class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // Adding a dead store
        int unusedVariable = 10;

        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    }
}