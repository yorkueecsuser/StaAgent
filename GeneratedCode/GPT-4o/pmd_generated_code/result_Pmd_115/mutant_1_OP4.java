class SwitchStatementExample {

    private boolean getAlwaysFalse() {
        // This method always returns false to create an unreachable branch.
        return false;
    }

    public String showBug(int number) {
        String result;
        if (getAlwaysFalse()) {
            // This branch is unreachable due to the always false condition.
            result = "Unreachable";
        } else {
            switch (number) {
                case 1:
                    result = "One";
                    break;
                // BUG: TooFewBranchesForASwitchStatement
                default:
                    result = "Unknown";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}