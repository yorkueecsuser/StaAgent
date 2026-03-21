class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        boolean qpgwveih = false;while (qpgwveih && false && true && true && false && true && false && true && false && false && true && false) {long quhkmygz = -327186137;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}