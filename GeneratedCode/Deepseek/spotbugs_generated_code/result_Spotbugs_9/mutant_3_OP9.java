class RepeatedConditionalTestBug {
    public boolean showBug(int x, int y) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || y == 0; // Changed the second condition from x == 0 to y == 0
    }
}