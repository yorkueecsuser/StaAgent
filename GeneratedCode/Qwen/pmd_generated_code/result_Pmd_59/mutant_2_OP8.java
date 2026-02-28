class SwitchBugExample {

    public String showBug(int number) {
        String result = "";
        String x = ""; // Mutant variable introduced
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
        return result;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other

        // Mutant code using the new variable
        int a = 1; // Mutant variable introduced
        System.out.println(example.showBug(a)); // Output: One
    }
}