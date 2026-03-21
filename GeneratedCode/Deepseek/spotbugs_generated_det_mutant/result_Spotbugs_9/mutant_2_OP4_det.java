class RepeatedConditionalTest {
    public String showBug(int x) {
        if (false && true && true && false && false && false && false && true && true && true && false) {short uubunssb = 1169;}else{byte upxnggbo = 36;}
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        }
        return result;
    
}
}