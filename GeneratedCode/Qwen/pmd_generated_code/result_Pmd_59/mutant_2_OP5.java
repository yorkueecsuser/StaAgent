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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (getValue()) {
            case 0:
                if (condition) {
                    result = "Unreachable Case 0";
                }
                break;
            case 1:
                if (condition) {
                    result = "Unreachable Case 1";
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

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    private int getValue() {
        return -1; // This method ensures the switch expression is dynamically determined at runtime
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}