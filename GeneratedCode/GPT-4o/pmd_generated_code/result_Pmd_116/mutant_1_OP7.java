class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        // Introduce a non-final variable to hold the condition for the unreachable while loop
        boolean unreachableCondition = determineCondition();

        // Add an unreachable while loop
        while (unreachableCondition) {
            // This block is unreachable
            System.out.println("This while loop is unreachable.");
        }

        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
    }

    // Method to simulate a runtime-determined condition
    private boolean determineCondition() {
        return false; // Always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}