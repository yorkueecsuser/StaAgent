class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        if (true && false && false && true && false && false && false && true && true && true && false) {String mbsapfic = "otpzdzci";}else{byte qdlluask = 11;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}