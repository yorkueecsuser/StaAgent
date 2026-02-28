class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        // Mutant code with duplication
        int y = x;
        return x == 0 || y == 0;
    }
}