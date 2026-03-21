class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        if (true && true && true && true && false && true && false && true && true && true && false) {short qywrbgib = 6301;}else{char wnezsmmb = 'o';}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}