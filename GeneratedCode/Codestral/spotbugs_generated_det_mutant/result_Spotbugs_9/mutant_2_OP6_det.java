class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        for  (int xwmkmmur = 0; xwmkmmur < 0; xwmkmmur++) {boolean xekwhgyp = true;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}