class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        // Inserted unreachable if statement
        boolean unreachableCondition = getFalseCondition(); // Condition dynamically determined
        if (unreachableCondition) {
            result = "This code is unreachable because the condition is always false";
        }
        
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        
        // Inserted unreachable if statement
        boolean unreachableCondition = getFalseCondition(); // Condition dynamically determined
        if (unreachableCondition) {
            result = "This code is unreachable because the condition is always false";
        }
        
        return result;
    }

    // Helper method to return a false condition
    private boolean getFalseCondition() {
        return false; // This will be evaluated at runtime
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}