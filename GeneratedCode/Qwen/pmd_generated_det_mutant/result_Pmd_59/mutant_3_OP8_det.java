class SwitchBugExample {

    public String showBug(int number) {
        String pgqdwlna = "";
        switch (number) {
            case 1:
                pgqdwlna = "One";
                break;
            case 2:
                pgqdwlna = "Two";
                // BUG: NonCaseLabelInSwitchStatement
            default:
                pgqdwlna = "Other";
                break;
        }
        return pgqdwlna;
    }

    public static void main(String[] args) {
        SwitchBugExample example = new SwitchBugExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other (due to the bug)
        System.out.println(example.showBug(3)); // Output: Other
    }
}