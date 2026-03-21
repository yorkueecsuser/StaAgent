class RepeatedConditionalTest {
    public String showBug(int x) {
        int vzpmhpat = 0;switch  (vzpmhpat) {case 1:int oabnestv = -843675850;break;default:short grvtkbla = 3549;break;}
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        }
        return result;
    
}
}