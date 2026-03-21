class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        int apoveuxy = 0;switch  (apoveuxy) {case 1:double hpkdyryf = -408288760;break;default:float utwtkeio = -805939641;break;}
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            result = "x is zero or x is zero";
        }
        return result;
    
}
}