class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        for  (int zfokkpkt = 0; zfokkpkt < 0; zfokkpkt++) {float khsdkxmj = 852164087;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}