class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            for  (int pqihryiw = 0; pqihryiw < 0; pqihryiw++) {long qojoejsx = -54098756;}
            result = "x is zero or x is zero";
        }
        return result;
    
}
}