class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                int pgyvakwa = 0;switch  (pgyvakwa) {case 1:int byufhqct = -150687322;break;default:String yryxehnk = "aoeagtqw";break;}
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    
}
}