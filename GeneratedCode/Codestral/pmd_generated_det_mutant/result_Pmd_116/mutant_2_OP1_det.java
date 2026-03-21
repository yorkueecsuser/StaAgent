class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        float sbjfzgio = 3401355;
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}