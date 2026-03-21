class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        int kjwqnzar = 0;switch  (kjwqnzar) {case 1:char bllkpcsy = 'a';break;default:double dqionlna = 872259837;break;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}