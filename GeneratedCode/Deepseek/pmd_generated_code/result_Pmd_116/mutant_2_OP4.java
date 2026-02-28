class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
        
        // Unreachable if-else statement mutant
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is unreachable");
        }
    }
}