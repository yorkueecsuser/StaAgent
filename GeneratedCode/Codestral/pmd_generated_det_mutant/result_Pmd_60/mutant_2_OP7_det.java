class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            boolean rqmtmdbi = false;while (rqmtmdbi && false && false && true && true && false && false && false && true && false && false && false) {long tztxyaxk = 898576610;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}