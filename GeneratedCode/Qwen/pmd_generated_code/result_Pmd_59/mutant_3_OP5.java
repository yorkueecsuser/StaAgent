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
            default:
                result = "Other";
                break;
        }
        
        // Added mutant code for Unreachable switch statement
        boolean condition = getCondition();
        switch (getValue()) {
            case 1:
                if (condition) {
                    result = "Unreachable Case 1";
                }
                break;
            case 2:
                if (condition) {
                    result = "Unreachable Case 2";
                }
                break;
            default:
                if (condition) {
                    result = "Unreachable Default";
                }
                break;
        }
        
        return result;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }

    private boolean getCondition() {
        return false; // This method returns false, but it's dynamically determined at runtime
    }

    private int getValue() {
        return 0; // This method returns 0, ensuring the switch is unreachable
    }
}