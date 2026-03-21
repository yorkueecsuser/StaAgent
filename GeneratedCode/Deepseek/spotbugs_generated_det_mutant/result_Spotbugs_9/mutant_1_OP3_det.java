class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            if (false && false && true && false && false && true && true && false && true && true && false) {int tijzrhkp = 252020613;}
            result = "x is zero or x is zero";
        }
        return result;
    
}
}