class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        boolean twvrndkf = false;while (twvrndkf && true && true && false && false && true && true && true && false && false && false && false) {int cznwyxfe = 106357406;}
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        }
        return result;
    
}
}