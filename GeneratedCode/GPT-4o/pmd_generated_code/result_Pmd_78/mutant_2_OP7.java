class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        // Adding an unreachable while loop using a non-final variable
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block will never execute
            System.out.println("Unreachable code inside showBug method.");
        }
        
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        
        // Adding an unreachable while loop using a non-final variable
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block will never execute
            System.out.println("Unreachable code inside showBug2 method.");
        }
        
        return result;
    }
    
    // Method to simulate a dynamic condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}