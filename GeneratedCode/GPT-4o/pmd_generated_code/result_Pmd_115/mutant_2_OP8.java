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

    // Mutated version with renamed variable
    public String showBugMutant(int number) {
        String x; // Renamed the variable 'result' to 'x'
        switch (number) {
            case 1:
                x = "One";
                break;
            default:
                x = "Unknown";
        }
        return x;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
        
        // Testing the mutated method
        System.out.println(example.showBugMutant(1)); // Expected "One"
        System.out.println(example.showBugMutant(2)); // Expected "Unknown"
    }
}