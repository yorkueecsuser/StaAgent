class SwitchStatementExample {

    // Method to get a condition for unreachable while loop
    private boolean getCondition() {
        return false;
    }

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

        // Unreachable while loop inserted as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable code block.");
        }

        return result;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}