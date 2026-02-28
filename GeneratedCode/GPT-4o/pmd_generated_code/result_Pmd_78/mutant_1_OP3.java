class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }

        // Mutant: Adding an unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            result = "This branch is unreachable because the condition is always false";
        }
        
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }

        // Mutant: Adding another unreachable if statement
        boolean anotherUnreachableCondition = getFalseCondition();
        if (anotherUnreachableCondition) {
            result = "This branch is also unreachable because the condition is always false";
        }

        return result;
    }

    // Helper method to simulate a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}