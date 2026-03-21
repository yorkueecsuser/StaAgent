class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        int cvoexrxm = 0;switch  (cvoexrxm) {case 1:short qjmynkro = 4749;break;default:short gybfzowr = -257;break;}
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        return x == 0 || x == 0;
    
}
}