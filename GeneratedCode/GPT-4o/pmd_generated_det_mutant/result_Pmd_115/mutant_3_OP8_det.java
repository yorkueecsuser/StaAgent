class SwitchStatementExample {

    public String showBug(int number) {
        String qgponzxq;
        switch (number) {
            case 1:
                qgponzxq = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                qgponzxq = "Unknown";
        }
        return qgponzxq;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}