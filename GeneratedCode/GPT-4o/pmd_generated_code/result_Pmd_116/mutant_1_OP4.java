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
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
        
        // Adding an unreachable if-else statement
        boolean runtimeCondition = getRuntimeCondition();
        if (runtimeCondition) {
            System.out.println("This will never execute");
        } else {
            System.out.println("This is the else block");
        }
    }
    
    // Method to simulate a runtime condition that always returns false
    private static boolean getRuntimeCondition() {
        return false;
    }
}