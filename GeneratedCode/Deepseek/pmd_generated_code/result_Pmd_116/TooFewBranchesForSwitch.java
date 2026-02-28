class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    }
    public void mutant(){
        int condition = 1;
        switch (condition) {
            case 1:
                System.out.println("Condition is 1");
                break;
            case 2: // Mutation: Renaming
                System.out.println("Condition is 2");
                break;
        }
    }
}