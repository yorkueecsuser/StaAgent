class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            result = "Unreachable branch executed";
        } else {
            result = "Unreachable else branch executed";
        }
        
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        
        // Mutant: Unreachable if-else statement
        boolean unreachableCondition2 = getCondition();
        if (unreachableCondition2) {
            result = "Unreachable branch executed";
        } else {
            result = "Unreachable else branch executed";
        }
        
        return result;
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}