class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            if (true && false && true && false && true && true && false && false && true && true && false) {float jiykmttt = -418551784;}else{double tephebcv = 933623940;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}