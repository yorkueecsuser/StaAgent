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

        // Unreachable while loop mutant
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This line is unreachable.");
        }

        return result;
    }

    // Method to ensure the while loop is unreachable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}