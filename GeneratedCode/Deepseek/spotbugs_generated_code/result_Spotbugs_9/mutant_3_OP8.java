class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        int y = x;
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return y == 0 || x == 0;
    }
}