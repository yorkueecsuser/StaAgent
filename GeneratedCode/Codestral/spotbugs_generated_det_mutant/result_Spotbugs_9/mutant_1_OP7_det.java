class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        boolean ksmgocvi = false;while (ksmgocvi && true && false && false && true && true && false && true && false && true && false && false) {byte odwcqjfo = 50;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}