class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            int vmmkqoua = 0;switch  (vmmkqoua) {case 1:float wmaguvor = -969225379;break;default:char denecvjd = 'h';break;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}