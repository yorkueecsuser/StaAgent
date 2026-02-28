class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        // Inserted unreachable switch statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 999: // This case will never be executed
                result = "This case is unreachable due to the value of unreachableSwitchVar";
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
        
        // Inserted unreachable switch statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 888: // This case will never be executed
                result = "This case is unreachable due to the value of unreachableSwitchVar";
                break;
            default:
                break;
        }
        
        return result;
    }
    
    // Method to provide a dynamic value for the switch statements
    private int getUnreachableSwitchValue() {
        // This method returns a constant value that does not match any case in switch
        return 0;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}