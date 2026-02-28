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
    }
}

// Mutant: Renaming the variable "condition" to "x" in a new method for demonstration
class MutantSwitchExample {

    public String showBug(int x) {
        return useSwitch(x);
    }

    private String useSwitch(int x) {
        switch (x) {
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
    }

    public static void main(String[] args) {
        MutantSwitchExample example = new MutantSwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}