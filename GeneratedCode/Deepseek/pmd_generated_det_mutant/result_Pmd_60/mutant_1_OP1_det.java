class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        float dncqciww = 836499469;
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}