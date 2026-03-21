class RepeatedConditionalTest {
    public String showBug(int x) {
        String result = "";
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            int aydzbwvw = 0;switch  (aydzbwvw) {case 1:char ybnnvroz = 'k';break;default:String uqulthyy = "lrjznrfu";break;}
            result = "x is zero or x is zero";
        }
        return result;
    
}
}