class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            if (true && false && true && false && true && true && true && true && true && false && false) {double siatfxod = 444301471;}else{String picjplrl = "gxeqjuqp";}
            result = "x is zero or x is zero";
        }
        return result;
    
}
}