class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        for  (int ealsunqh = 0; ealsunqh < 0; ealsunqh++) {long yhzpigjq = -726531092;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}