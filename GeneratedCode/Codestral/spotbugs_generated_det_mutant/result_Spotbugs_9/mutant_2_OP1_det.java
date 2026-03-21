class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        int silzalwb = 565358557;
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}