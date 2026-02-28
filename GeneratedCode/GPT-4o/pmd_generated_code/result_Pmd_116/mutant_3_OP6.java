class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        // Introduce a variable to ensure the for loop is unreachable without causing compile-time errors
        boolean runLoop = getFalseCondition();
        for (int i = 0; runLoop; i++) {
            // Unreachable code block
            System.out.println("This loop is never executed.");
        }

        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
    }

    // Helper method to provide a false condition to avoid compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}