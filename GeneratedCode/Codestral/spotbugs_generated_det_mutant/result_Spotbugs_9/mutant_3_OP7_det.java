class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        boolean ojenzakg = false;while (ojenzakg && true && false && true && true && false && true && false && true && false && true && false) {float gdgfncor = 543993124;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}