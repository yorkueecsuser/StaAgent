class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        // Unreachable if-else statement mutation
        boolean unreachableCondition = customCondition();
        if (unreachableCondition) {
            result = "Unreachable if block executed";
        } else {
            result = "Unreachable else block executed";
        }
        
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        
        // Unreachable if-else statement mutation
        boolean unreachableCondition = customCondition();
        if (unreachableCondition) {
            result = "Unreachable if block executed";
        } else {
            result = "Unreachable else block executed";
        }
        
        return result;
    }

    // Simulated method to provide a runtime condition
    private boolean customCondition() {
        return false; // This is dynamic at runtime, avoiding compile-time constants
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}