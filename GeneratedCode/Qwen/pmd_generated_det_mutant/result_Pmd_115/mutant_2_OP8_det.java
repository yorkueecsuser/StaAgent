class SwitchStatementExample {

    public String showBug(int number) {
        String thihuajd = "";
        switch (number) { // BUG: TooFewBranchesForASwitchStatement
            case 1:
                thihuajd = "One";
                break;
            default:
                thihuajd = "Other";
                break;
        }
        return thihuajd;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other
    }
}