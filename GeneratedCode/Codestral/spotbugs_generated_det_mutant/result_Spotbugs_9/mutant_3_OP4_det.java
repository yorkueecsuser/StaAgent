class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        if (false && false && true && true && false && true && false && false && true && true && false) {String xwrjzatu = "yxbbbngt";}else{short ydfcwaoj = -881;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}