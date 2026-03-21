class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        if (true && false && false && false && false && true && true && false && false && true && false) {double alcxeouw = -678304164;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}