class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        if (false && true && false && true && false && true && true && false && true && false && false) {int qewmjwoe = -481057416;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}