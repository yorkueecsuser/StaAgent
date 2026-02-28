class SwitchStatementExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            case 1:
                result = "One";
                // Adding an unreachable for loop
                boolean conditionFor = getUnreachableCondition();
                for (int i = 0; conditionFor; i++) {
                    // This block will never execute
                    System.out.println("Unreachable code");
                }
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                result = "Unknown";
                // Adding an unreachable for loop
                boolean conditionForDefault = getUnreachableCondition();
                for (int i = 0; conditionForDefault; i++) {
                    // This block will never execute
                    System.out.println("Unreachable code");
                }
        }
        return result;
    }

    // Method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}