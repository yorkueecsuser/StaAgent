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

        // Inserting unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        }

        return result;
    }

    private boolean getFalseCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}