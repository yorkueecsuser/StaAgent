class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                System.out.println("Condition is not 1"); // Mutant
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    }
}