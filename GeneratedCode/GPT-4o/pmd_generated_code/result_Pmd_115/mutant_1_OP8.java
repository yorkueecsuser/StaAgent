class SwitchStatementExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            case 1:
                result = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                result = "Unknown";
        }
        return result;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}

// Mutant Code
class SwitchStatementExampleMutant {

    public String showBug(int n) { // Renamed 'number' to 'n'
        String r; // Renamed 'result' to 'r'
        switch (n) {
            case 1:
                r = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                r = "Unknown";
        }
        return r;
    }

    public static void main(String[] args) {
        SwitchStatementExampleMutant exampleMutant = new SwitchStatementExampleMutant();
        System.out.println(exampleMutant.showBug(1)); // Expected "One"
        System.out.println(exampleMutant.showBug(2)); // Expected "Unknown"
    }
}