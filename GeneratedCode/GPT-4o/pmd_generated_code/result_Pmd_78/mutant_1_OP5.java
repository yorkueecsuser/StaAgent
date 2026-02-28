class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        int unreachableSwitchValue = getUnreachableValue(); // Obtain the value for the switch
        switch (unreachableSwitchValue) { // Unreachable switch statement as it evaluates to a value not in case
            case -1:
                result = "Unreachable code block";
                break;
            default:
                break;
        }

        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        
        int unreachableSwitchValue2 = getUnreachableValue(); // Obtain the value for the switch
        switch (unreachableSwitchValue2) { // Unreachable switch statement as it evaluates to a value not in case
            case -2:
                result = "Unreachable code block";
                break;
            default:
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        return -99; // This will ensure that the switch cases are never hit
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}