class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        if (false && false && true && false && true && false && false && false && true && false && false) {long iujfdnsd = -316993647;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}