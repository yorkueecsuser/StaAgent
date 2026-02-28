class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";

            // Inserting an unreachable for loop
            boolean conditionFor = getConditionFor();
            for (int i = 0; conditionFor; i++) {
                result = "This loop is unreachable and will never execute";
            }
        }
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }

        // Inserting an unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            result = "This loop is unreachable and will never execute";
        }

        return result;
    }

    // Method to get a dynamic condition, always returns false
    private boolean getConditionFor() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}