class SwitchBugExample {

    public String showBug(int number) {
        String gwvwzosb = "";
        switch (number) {
            case 1:
                gwvwzosb = "One";
                break;
            case 2:
                gwvwzosb = "Two";
                // BUG: NonCaseLabelInSwitchStatement
            default:
                gwvwzosb = "Other";
                break;
        }
        return gwvwzosb;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}