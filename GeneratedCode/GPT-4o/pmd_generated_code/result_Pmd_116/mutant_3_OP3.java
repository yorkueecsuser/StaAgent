class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        boolean unreachableCondition = calculateUnreachableCondition(); // Helper method to ensure non-final condition
        if (unreachableCondition) {
            return "This should never execute";
        }
        
        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
    }
    
    // Helper method to ensure the condition is not a compile-time constant
    private boolean calculateUnreachableCondition() {
        return false; // Runtime evaluated but always false
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}