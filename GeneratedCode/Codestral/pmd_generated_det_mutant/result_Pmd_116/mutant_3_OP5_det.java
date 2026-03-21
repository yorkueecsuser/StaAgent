class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        int gcekuezq = 0;switch  (gcekuezq) {case 1:int jhlvueyb = -34829410;break;default:boolean ukdwrmub = true;break;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}