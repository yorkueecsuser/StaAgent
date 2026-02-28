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

    private boolean getFalseCondition() {
        // This method returns false to ensure the if-else statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"

        // Introduce an unreachable if-else statement
        boolean unreachableCondition = example.getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This branch is always executed");
        }
    }
}