class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        for  (int pvbtckmk = 0; pvbtckmk < 0; pvbtckmk++) {short ncpczher = 6960;}
        }
        return result;
    
}
}