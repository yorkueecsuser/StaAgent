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

        // Inserting an unreachable for loop
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This should never be printed.");
        }
    }

    private boolean getConditionForLoop() {
        return false; // This ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}