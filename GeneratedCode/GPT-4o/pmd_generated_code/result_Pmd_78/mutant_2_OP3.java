class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        // Mutation: Inserting an unreachable if branch
        boolean unreachableCondition = getFalseCondition(); 
        if (unreachableCondition) { 
            result = "This code is unreachable due to the condition always being false";
        }
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        // Mutation: Inserting an unreachable if branch
        boolean unreachableCondition = getFalseCondition(); 
        if (unreachableCondition) { 
            result = "This code is unreachable due to the condition always being false";
        }
        return result;
    }

    // Helper method to simulate an unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}