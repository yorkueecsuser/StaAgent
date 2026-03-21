class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        for  (int lgygoywv = 0; lgygoywv < 0; lgygoywv++) {String ahhxjcen = "otyqcbcw";}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}