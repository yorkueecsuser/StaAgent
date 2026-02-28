class ParameterOverwriteExample {

    // Method demonstrating the bug
    public int showBug(int initialValue) {
        int result = initialValue; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN) 
        result = 42; // The initial value is ignored and overwritten

        // Mutant code: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            result = initialValue; // This line is unreachable because condition is always false
        }

        return result;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        ParameterOverwriteExample example = new ParameterOverwriteExample();
        int output = example.showBug(10); // Expected to return 10, but returns 42 due to the bug
        System.out.println("Output: " + output);
    }
}