class SwitchBugExample {

    public String showBug(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "One"; // Original assignment
                result = "One"; // Duplicated assignment
                break;
            case 2:
                result = "Two"; // Original assignment
                result = "Two"; // Duplicated assignment
                // BUG: NonCaseLabelInSwitchStatement
            default:
                result = "Other"; // Original assignment
                result = "Other"; // Duplicated assignment
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
}