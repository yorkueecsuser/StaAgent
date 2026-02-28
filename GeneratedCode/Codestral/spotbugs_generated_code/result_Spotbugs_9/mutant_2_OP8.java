class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        int y = x; // Add a new variable 'y' that is a copy of 'x'
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || y == 0; // Use 'y' in the second conditional test
    }
}