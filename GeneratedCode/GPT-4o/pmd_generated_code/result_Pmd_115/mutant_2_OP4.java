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
        
        // Inserting an unreachable if-else branch with a dynamically determined condition
        boolean unreachableCondition = getUnreachableCondition(); // Dynamically determined
        if (unreachableCondition) {
            result = "This will never be reached";
        } else {
            // This is the reachable code
        }

        return result;
    }

    // Method to dynamically determine the condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}