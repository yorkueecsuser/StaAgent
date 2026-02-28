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
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        }

        return result;
    }

    // Method to provide a false condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}