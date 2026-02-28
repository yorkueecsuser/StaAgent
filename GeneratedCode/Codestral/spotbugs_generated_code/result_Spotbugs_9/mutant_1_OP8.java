class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        int y = 1; // Mutated variable
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || y == 0;
    }
}