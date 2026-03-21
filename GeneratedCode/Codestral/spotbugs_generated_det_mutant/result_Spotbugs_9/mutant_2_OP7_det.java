class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        boolean qihmduyf = false;while (qihmduyf && false && false && true && true && false && true && true && true && false && true && false) {short ekzzhbmf = -2337;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}