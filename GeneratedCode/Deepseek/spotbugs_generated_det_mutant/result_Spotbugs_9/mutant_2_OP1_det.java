class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            int dtfuxwtr = 447063581;
            result = "x is zero or x is zero";
        }
        return result;
    
}
}