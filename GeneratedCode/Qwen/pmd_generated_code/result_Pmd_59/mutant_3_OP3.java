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
                boolean unreachableCondition = getUnreachableCondition();
                if (unreachableCondition) {
                    result = "Unreachable"; // This branch is unreachable
                }
            default:
                result = "Other";
                break;
        }
        return result;
    }

    private boolean getUnreachableCondition() {
        return false; // This method returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}