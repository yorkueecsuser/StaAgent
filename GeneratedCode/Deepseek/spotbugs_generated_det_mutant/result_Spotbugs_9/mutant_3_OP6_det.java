class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            for  (int zwuryooy = 0; zwuryooy < 0; zwuryooy++) {double npshferx = -249216596;}
            result = "x is zero or x is zero";
        }
        return result;
    
}
}