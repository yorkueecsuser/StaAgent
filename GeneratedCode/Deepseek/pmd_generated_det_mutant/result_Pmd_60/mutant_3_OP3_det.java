class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        if (true && false && true && true && false && false && true && false && true && false && false) {byte tbufwjkh = -43;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}