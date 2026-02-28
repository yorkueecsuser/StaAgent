class SwitchStatementExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            case 1:
                result = "One";
                if (isConditionFalse()) { // Unreachable if statement
                    result = "This will never be shown";
                }
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                result = "Unknown";
        }
        return result;
    }

    // Helper method to ensure the condition is unreachable
    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}