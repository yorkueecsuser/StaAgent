class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        // Inserted unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            result = "This code will never execute";
        } else {
            // The else block is reachable and does not affect the original code
        }

        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        
        // Inserted unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            result = "This code will never execute";
        } else {
            // The else block is reachable and does not affect the original code
        }

        return result;
    }
    
    // Method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}