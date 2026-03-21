class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                int ldsrcqgo = 0;switch  (ldsrcqgo) {case 1:short qncuatqv = -4347;break;default:long swmznifu = 186874644;break;}
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    
}
}