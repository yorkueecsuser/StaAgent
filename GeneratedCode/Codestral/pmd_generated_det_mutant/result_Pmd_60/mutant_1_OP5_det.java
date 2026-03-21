class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            int kmbwjzvc = 0;switch  (kmbwjzvc) {case 1:short whvgtwkq = -8339;break;default:byte axlvfcae = 114;break;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}