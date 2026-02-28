class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                String result = "Case 1 executed";
                // Duplicate assignment statement
                result = "Case 1 executed";
                return result;
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