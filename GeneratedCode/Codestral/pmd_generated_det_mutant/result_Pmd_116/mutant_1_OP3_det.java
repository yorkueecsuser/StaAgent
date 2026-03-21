class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        if (true && false && true && true && false && true && false && true && false && false && false) {byte wjlloyjs = -53;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}