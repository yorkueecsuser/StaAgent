class SwitchStatementExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            case 1:
                result = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                result = "Unknown";
        }

        // Introduce an unreachable if-else statement using a dynamic condition
        boolean condition = getCondition();
        if (condition) {
            // This branch will never execute as condition is always false
            result = "Unreachable Branch";
        } else {
            // This is the reachable branch
            result = result; // No change to ensure the logic remains the same
        }

        return result;
    }

    // Method to simulate a condition that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}