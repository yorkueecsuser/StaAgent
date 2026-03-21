class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            if (false && true && true && true && true && true && false && false && false && true && false) {String nllrwmjr = "amnwglid";}
            result = "x is zero or x is zero";
        }
        return result;
    
}
}