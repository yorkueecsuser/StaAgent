class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        if (false && false && false && true && true && false && false && false && true && true && false) {boolean jmosaiup = true;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}