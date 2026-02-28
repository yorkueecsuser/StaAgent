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

        // Unreachable switch statement added as a mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 100: // This case will never be reached
                System.out.println("This is unreachable code.");
                break;
            default:
                // Do nothing
        }

        return result;
    }

    private int getUnreachableValue() {
        return 200; // This will ensure the switch case is never reached
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}