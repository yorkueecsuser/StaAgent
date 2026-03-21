class SwitchBugExample {

    public String showBug(int number) {
        String ltryakqb = "";
        switch (number) {
            case 1:
                ltryakqb = "One";
                break;
            case 2:
                ltryakqb = "Two";
                // BUG: NonCaseLabelInSwitchStatement
            default:
                ltryakqb = "Other";
                break;
        }
        return ltryakqb;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}