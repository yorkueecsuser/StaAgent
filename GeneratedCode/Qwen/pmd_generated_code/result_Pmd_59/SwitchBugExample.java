class SwitchBugExample {

    public String showBug(int number) {
        String result = "";
        String x = ""; // Mutant variable
        switch (number) {
            case 1:
                result = "One";
                x = "One"; // Mutant assignment
                break;
            case 2:
                result = "Two";
                // BUG: NonCaseLabelInSwitchStatement
                x = "Two"; // Mutant assignment
            default:
                result = "Other";
                x = "Other"; // Mutant assignment
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