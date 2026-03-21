class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            int reixcaun = 0;switch  (reixcaun) {case 1:byte kesmxutz = 108;break;default:char znslcsym = 'm';break;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}