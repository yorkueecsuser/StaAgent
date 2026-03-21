class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        int qjqshnhe = 0;switch  (qjqshnhe) {case 1:long ttfjizak = -910728358;break;default:float myzkzamd = 839096502;break;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}