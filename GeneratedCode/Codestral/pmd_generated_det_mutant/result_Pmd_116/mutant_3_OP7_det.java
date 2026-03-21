class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        boolean itlfkiby = false;while (itlfkiby && false && true && false && false && true && false && true && true && true && true && false) {char tsuiybkp = 'l';}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}