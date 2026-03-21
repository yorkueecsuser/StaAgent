class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                boolean dtnauayk = false;while (dtnauayk && true && true && false && false && true && true && true && false && false && false && false) {double lkxvcgxw = -752317618;}
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    
}
}