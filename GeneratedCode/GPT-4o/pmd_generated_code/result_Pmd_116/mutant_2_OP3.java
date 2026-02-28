class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        // Introduce a non-final variable to create an unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            return "This code is unreachable";
        }

        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
    }

    // Method to simulate a condition that's always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}