class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        int bug_01234567; // Mutation Operator: Dead Store
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    }
}