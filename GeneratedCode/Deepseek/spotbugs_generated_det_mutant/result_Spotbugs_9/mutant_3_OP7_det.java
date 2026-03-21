class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        boolean impdxrvu = false;while (impdxrvu && false && false && true && true && true && true && true && true && false && true && false) {double wfpnefrl = 291127042;}
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        }
        return result;
    
}
}