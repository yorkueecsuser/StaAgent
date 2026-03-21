class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        boolean ahdeydug = false;while (ahdeydug && true && true && true && true && true && true && true && false && false && true && false) {float dvqnriyy = -323512782;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}