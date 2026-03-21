class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        if (true && false && false && false && false && false && true && false && false && false && false) {int voerorri = 479743954;}else{long kocxtbwu = 393508860;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}