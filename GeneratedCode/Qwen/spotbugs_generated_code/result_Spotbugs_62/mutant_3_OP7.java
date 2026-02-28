class NullParameterExample {

    // Method that expects a non-null String parameter
    public int getStringLength(String str) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return str.length(); // This line will throw a NullPointerException if str is null
    }

    // Public method to demonstrate the bug
    public int showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return getStringLength(input); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        // Demonstrating the bug by passing null
        System.out.println(example.showBug(null));
    }

    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false;
    }
}