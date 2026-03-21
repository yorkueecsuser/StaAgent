class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        if (true && false && true && false && false && true && true && false && true && false && false) {double vhvjlfyj = 669486526;}else{String irvpvqbe = "vlpuadkf";}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}