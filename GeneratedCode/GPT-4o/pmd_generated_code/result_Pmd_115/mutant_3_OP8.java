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
    
    public String showBug(int x) { // Variable 'number' renamed to 'x'
        String result;
        switch (x) {
            case 1:
                result = "One";
                break;
            default:
                result = "Unknown";
        }
        return result;
    }

    public static void main(String[] args) {
        SwitchStatementExampleMutant example = new SwitchStatementExampleMutant();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}