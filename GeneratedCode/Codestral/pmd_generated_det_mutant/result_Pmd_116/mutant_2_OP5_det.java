class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        int nhtdcwar = 0;switch  (nhtdcwar) {case 1:double hecoefvk = 821164908;break;default:int nwsyqojp = -899879485;break;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}