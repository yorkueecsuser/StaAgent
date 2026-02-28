class ParameterOverwriteExample {

    // Method demonstrating the bug
    public int showBug(int initialValue) {
        int result = initialValue; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN) 
        result = 42; // The initial value is ignored and overwritten

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            result = 99; // Unique code inside the loop
        }

        return result;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ParameterOverwriteExample example = new ParameterOverwriteExample();
        int output = example.showBug(10); // Expected to return 10, but returns 42 due to the bug
        System.out.println("Output: " + output);
    }
}