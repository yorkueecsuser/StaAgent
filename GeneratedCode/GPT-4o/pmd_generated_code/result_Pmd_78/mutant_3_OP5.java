class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }

        // Inserting an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                result = "Unreachable case 1";
                break;
            default:
                result = "Default case, also unreachable";
                break;
        }

        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }

        // Inserting another unreachable switch statement
        int anotherUnreachableSwitchCondition = getAnotherUnreachableSwitchCondition();
        switch (anotherUnreachableSwitchCondition) {
            case 2:
                result = "Unreachable case 2";
                break;
            default:
                result = "Another unreachable default case";
                break;
        }

        return result;
    }

    private int getUnreachableSwitchCondition() {
        return 0; // Always returning 0 makes the switch case unreachable
    }

    private int getAnotherUnreachableSwitchCondition() {
        return -1; // Always returning -1 makes the switch case unreachable
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}