class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        if (true && false && false && false && true && true && true && true && true && false && false) {String hxerrifo = "ohngnnxj";}else{double dpkpmovh = 713164130;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}