class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        for  (int skclyiil = 0; skclyiil < 0; skclyiil++) {String jccvkhto = "cnbnfirg";}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}