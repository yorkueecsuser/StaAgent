class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        int bynovmde = 0;switch  (bynovmde) {case 1:boolean sfgshvpu = false;break;default:String yjhfbzmu = "lmjtbtmp";break;}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}