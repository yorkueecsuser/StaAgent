class NullParameterExample {

    // Method that expects a non-null String parameter
    public int getStringLength(String str) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This block should never execute.");
        } else {
            // This block is also intended to be unreachable
            System.out.println("This block should also never execute.");
        }
        return str.length(); // This line will throw a NullPointerException if str is null
    }

    // Public method to demonstrate the bug
    public int showBug(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This block should never execute.");
        } else {
            // This block is also intended to be unreachable
            System.out.println("This block should also never execute.");
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