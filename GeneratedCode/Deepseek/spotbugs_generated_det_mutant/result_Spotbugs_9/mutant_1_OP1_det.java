class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        long qxlhbeub = 498719359;
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        }
        return result;
    
}
}