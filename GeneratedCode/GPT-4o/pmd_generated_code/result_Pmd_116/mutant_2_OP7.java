class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        // Introduce a non-final variable for unreachable while loop
        boolean conditionWhile = getFalseCondition(); 
        while (conditionWhile) {
            // This block is unreachable due to the condition being always false
            System.out.println("This line will never be executed.");
        }

        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
    }

    // Method to return false, ensuring while loop condition is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}