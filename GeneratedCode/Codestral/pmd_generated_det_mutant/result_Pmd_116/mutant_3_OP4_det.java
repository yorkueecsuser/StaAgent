class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        if (false && false && false && true && true && false && false && false && true && true && false) {char xnlmsozm = 'f';}else{int mfcmteto = 781809267;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}