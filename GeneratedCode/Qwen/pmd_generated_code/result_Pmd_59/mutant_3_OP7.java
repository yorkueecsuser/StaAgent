class SwitchBugExample {

    public String showBug(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                // BUG: NonCaseLabelInSwitchStatement
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                    // Unreachable while loop
                }
            default:
                result = "Other";
                break;
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method returns false, but it is not a compile-time constant
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}