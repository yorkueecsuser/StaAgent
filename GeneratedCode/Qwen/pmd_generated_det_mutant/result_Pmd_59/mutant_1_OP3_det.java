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
            if (true && true && true && true && false && true && false && false && true && true && false) {float ubinyuwo = 366176145;}
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
    }
}