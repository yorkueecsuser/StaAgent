class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
                for(int i = 0; false; i++) { // Mutation: Unreachable for loop
                    System.out.println("Unreachable code"); // This is the mutated code
                }
        }
    }
}