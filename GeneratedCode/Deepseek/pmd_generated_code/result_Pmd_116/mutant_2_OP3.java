class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                boolean unreachableCondition = false; // Mutation: Unreachable if statement 
                if (unreachableCondition) {
                    System.out.println("Unreachable branch"); // Mutation: Unreachable
                }
                break; // Not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    }
}