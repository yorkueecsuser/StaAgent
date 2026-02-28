class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }

        // Unreachable for loop mutation start
        for (int i = 0; false; i++) {
            // This code will never be reached.
            System.out.println("This code will never be reached");
        }
        // Unreachable for loop mutation end
    }
}