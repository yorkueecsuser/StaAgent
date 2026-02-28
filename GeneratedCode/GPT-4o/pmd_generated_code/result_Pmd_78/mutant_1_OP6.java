class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        
        // Mutant: Unreachable for loop
        boolean unreachableCondition1 = getUnreachableCondition();
        for (int i = 0; unreachableCondition1; i++) {
            // This code block will never execute
            System.out.println("Unreachable for loop in showBug");
        }
        
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        
        // Mutant: Unreachable for loop
        boolean unreachableCondition2 = getUnreachableCondition();
        for (int i = 0; unreachableCondition2; i++) {
            // This code block will never execute
            System.out.println("Unreachable for loop in showBug2");
        }
        
        return result;
    }

    // Helper method to simulate dynamic condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}