class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
            // Insert an unreachable while loop with a non-final variable
            boolean unreachableCondition = getFalseCondition();
            while (unreachableCondition) {
                // This code is unreachable
                System.out.println("Unreachable code inside showBug");
            }
        }
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        // Insert an unreachable while loop with a non-final variable
        boolean unreachableCondition = getFalseCondition();
        while (unreachableCondition) {
            // This code is unreachable
            System.out.println("Unreachable code inside showBug2");
        }
        return result;
    }

    private boolean getFalseCondition() {
        return false; // Used to simulate a condition that evaluates to false
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}