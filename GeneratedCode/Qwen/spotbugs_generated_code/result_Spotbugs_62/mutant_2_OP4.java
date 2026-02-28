class NullParameterExample {

    // Method that expects a non-null String parameter
    public int getStringLength(String str) {
        return str.length(); // This line will throw a NullPointerException if str is null
    }

    // Public method to demonstrate the bug
    public int showBug(String input) {
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is unreachable code.");
        }
        
        return getStringLength(input); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        // Demonstrating the bug by passing null
        System.out.println(example.showBug(null));
    }
}