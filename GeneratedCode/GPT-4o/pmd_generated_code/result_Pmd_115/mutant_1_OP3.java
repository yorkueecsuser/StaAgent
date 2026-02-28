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

        // Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            result = "Unreachable";
        }

        return result;
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}