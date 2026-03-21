class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            for  (int qeyinhpq = 0; qeyinhpq < 0; qeyinhpq++) {String hbdgtikw = "fgrlbbni";}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}