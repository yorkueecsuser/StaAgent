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
        
        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 3:
                System.out.println("This is unreachable");
                break;
            default:
                System.out.println("This default is also unreachable");
        }
    }

    // Method to ensure the switch is unreachable
    private static int getUnreachableCondition() {
        return 0; // This will never match case 3
    }
}