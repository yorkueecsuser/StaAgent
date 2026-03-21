class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        if (false && true && false && true && true && false && true && true && true && true && false) {char zzwqbmuh = 'x';}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}