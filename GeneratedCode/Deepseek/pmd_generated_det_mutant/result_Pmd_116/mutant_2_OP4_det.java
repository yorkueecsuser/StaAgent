class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                if (false && false && false && true && true && false && false && true && true && true && false) {float eamoxuxb = 216459971;}else{String hmnvafxi = "uzgznoqd";}
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    
}
}