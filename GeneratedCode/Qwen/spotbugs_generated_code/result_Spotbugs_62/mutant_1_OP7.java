class NullParameterExample {

    // Method that expects a non-null String parameter
    public int getStringLength(String str) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        return str.length(); // This line will throw a NullPointerException if str is null
    }

    // Public method to demonstrate the bug
    public int showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        return getStringLength(input); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        // Demonstrating the bug by passing null
        System.out.println(example.showBug(null));
    }
}