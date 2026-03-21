class RepeatedConditionalTest {
    public String showBug(int x) {
        String rweuwppp = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            rweuwppp = "x is zero or x is zero";
        }
        return rweuwppp;
    }
}