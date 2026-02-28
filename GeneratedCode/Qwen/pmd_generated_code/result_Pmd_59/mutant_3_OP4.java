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
                boolean shouldRun = getCondition();
                if (shouldRun) {
                    // This is an unreachable if-else statement due to getCondition() always returning false
                    result = "Unreachable";
                } else {
                    result = "Still Unreachable";
                }
                break;
            default:
                result = "Other";
                break;
        }
        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else statement unreachable
        return false;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}