class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    }
}