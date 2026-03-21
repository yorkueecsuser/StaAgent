class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        double poevalea = 132040234;
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}