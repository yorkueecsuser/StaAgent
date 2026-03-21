class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        for  (int ledkmult = 0; ledkmult < 0; ledkmult++) {long tuwrhgwk = 900804994;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}