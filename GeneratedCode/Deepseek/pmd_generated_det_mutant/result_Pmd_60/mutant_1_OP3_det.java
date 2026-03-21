class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        if (true && false && false && false && false && false && true && true && false && true && false) {long vtkjxxxw = 30831657;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}