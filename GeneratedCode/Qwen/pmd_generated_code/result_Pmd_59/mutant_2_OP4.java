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
                // Mutant: Inserting an unreachable if-else statement
                boolean shouldRun = getCondition();
                if (shouldRun) {
                    result = "Unreachable";
                } else {
                    result = "Still Unreachable";
                }
            default:
                result = "Other";
                break;
        }
        return result;
    }

    private boolean getCondition() {
        // This method ensures the condition is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}