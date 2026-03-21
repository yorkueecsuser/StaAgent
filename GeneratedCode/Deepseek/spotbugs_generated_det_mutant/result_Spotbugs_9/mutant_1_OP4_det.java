class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (true && true && true && true && true && true && false && false && false && true && false) {float xdbqvjjg = 102358543;}else{double stgbpqon = -954151130;}
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        }
        return result;
    
}
}