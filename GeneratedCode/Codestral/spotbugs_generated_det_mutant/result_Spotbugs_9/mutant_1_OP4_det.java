class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        if (true && true && true && true && false && true && false && true && true && false && false) {int tcgawuww = 716902142;}else{short mysvxvug = -1138;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}