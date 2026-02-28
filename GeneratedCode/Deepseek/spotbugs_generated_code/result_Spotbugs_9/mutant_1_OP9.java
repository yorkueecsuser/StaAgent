class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        // Mutated code: Changed the second occurrence of 'x == 0' to 'y == 0'
        // However, 'y' is not defined in this context, so this will still result in a compilation error
        int y = 1; // Added a definition for 'y' to avoid compilation error
        return x == 0 || y == 0;
    }
}