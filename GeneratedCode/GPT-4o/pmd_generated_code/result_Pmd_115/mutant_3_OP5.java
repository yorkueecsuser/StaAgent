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
        return result;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
        
        // Unreachable switch statement mutation
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never execute");
                    break;
                default:
                    System.out.println("Neither will this");
            }
        }
    }
    
    // Added method to simulate a runtime condition
    private static int getUnreachableValue() {
        return 0; // Return a value that would never match the switch cases
    }
}