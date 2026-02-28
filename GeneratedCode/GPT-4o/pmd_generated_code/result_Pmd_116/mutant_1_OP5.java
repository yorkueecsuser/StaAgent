class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
        
        // Inserted unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 10:
                return "Unreachable case 10 executed";
            default:
                // No need to return as this switch is unreachable by design
                break;
        }
        
        // This line will always be reachable due to the design of unreachableCondition
        return "This line is reachable";
    }
    
    private int getUnreachableCondition() {
        // Always returns a value that doesn't match the cases in the unreachable switch
        return 100;
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}