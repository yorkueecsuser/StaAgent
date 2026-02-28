class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
        int unreachableValue = 0; // New variable
        switch (unreachableValue) { // New unreachable switch statement
            default:
                System.out.println("This code is unreachable!");
                break;
        }
    }
}