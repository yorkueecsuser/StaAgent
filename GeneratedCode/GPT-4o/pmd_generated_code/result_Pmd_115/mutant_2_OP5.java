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

    private boolean getUnreachableCondition() {
        return false;
    }

    public void unreachableSwitch() {
        int unreachableValue = getUnreachableCondition() ? 1 : 2; // This ensures that the switch statement is unreachable
        switch (unreachableValue) {
            case 3:
                System.out.println("This is unreachable");
                break;
            case 4:
                System.out.println("This is also unreachable");
                break;
            default:
                System.out.println("Default unreachable");
        }
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
        
        // Call the method containing the unreachable switch statement
        example.unreachableSwitch(); // This will not output anything related to the switch cases
    }
}