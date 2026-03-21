class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        for  (int ujztpphe = 0; ujztpphe < 0; ujztpphe++) {double zytuzjgb = 649288696;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}