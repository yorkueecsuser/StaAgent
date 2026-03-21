class SwitchStatementExample {

    public String showBug(int number) {
        String dwljumpg;
        switch (number) {
            case 1:
                dwljumpg = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                dwljumpg = "Unknown";
        }
        return dwljumpg;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}