class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            // Mutant Code: Inserting unreachable while loop
            boolean conditionWhile = false;
            while (conditionWhile) {
                // This code will never execute
                System.out.println("This is an unreachable code block");
            }
            return true;
        }
        return false;
    }
}