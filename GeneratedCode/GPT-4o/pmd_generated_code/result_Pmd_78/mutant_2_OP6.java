class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        // Introducing an unreachable for loop
        boolean conditionFor = getCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            // This block will never execute as conditionFor is set to always be false
        }
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        // Introducing an unreachable for loop
        boolean conditionFor2 = getCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor2; i++) {
            // This block will never execute as conditionFor2 is set to always be false
        }
        return result;
    }

    // Method to return a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}