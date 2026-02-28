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
                    result = "Unreachable If";
                } else {
                    result = "Unreachable Else";
                }
            default:
                result = "Other";
                break;
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically at runtime
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}