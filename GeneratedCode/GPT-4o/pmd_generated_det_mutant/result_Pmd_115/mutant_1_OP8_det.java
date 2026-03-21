class SwitchStatementExample {

    public String showBug(int number) {
        String kejaincs;
        switch (number) {
            case 1:
                kejaincs = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                kejaincs = "Unknown";
        }
        return kejaincs;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}