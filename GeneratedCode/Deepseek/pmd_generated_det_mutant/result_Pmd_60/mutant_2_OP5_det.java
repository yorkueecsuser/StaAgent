class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        int sivetpdt = 0;switch  (sivetpdt) {case 1:boolean adtjsxao = true;break;default:long utnzupom = -292355570;break;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}