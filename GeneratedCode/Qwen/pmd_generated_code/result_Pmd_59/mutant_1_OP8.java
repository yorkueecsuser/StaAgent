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
        return result;
    }

    // Mutated code with renaming operator
    public String showBug(char x) {
        String y = "";
        switch (x) {
            case '1':
                y = "One";
                break;
            case '2':
                y = "Two";
                // BUG: NonCaseLabelInSwitchStatement
            default:
                y = "Other";
                break;
        }
        return y;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other

        // Testing mutated method
        System.out.println(example.showBug('1')); // Output: One
        System.out.println(example.showBug('2')); // Output: Two
        System.out.println(example.showBug('3')); // Output: Other
    }
}