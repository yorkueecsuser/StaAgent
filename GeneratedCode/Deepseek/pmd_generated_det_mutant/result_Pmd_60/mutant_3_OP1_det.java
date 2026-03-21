class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        boolean ygwttqfv = true;
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}