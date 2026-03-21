class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                if (true && false && false && false && true && true && false && false && false && true && false) {char xaretlui = 'u';}else{double ylcabdxs = -181260939;}
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    
}
}