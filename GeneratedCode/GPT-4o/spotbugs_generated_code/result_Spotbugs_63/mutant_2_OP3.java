class NullParameterBugDemo {

    public static void main(String[] args) {
        NullParameterBugDemo demo = new NullParameterBugDemo();
        demo.showBug(null); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
        
        // Unreachable if statement inserted
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            System.out.println("This is an unreachable code due to the condition always being false.");
        }
    }

    /**
     * A method that demonstrates a null pointer dereference bug by passing a null value
     * to a method that requires a non-null parameter.
     *
     * @param input A non-null String expected by the method.
     * @return Length of the input string.
     */
    public int showBug(String input) {
        return input.length(); // Dereferencing input without null check
    }

    // Method to simulate a condition that is used in unreachable code
    private static boolean getCondition() {
        return false; // Always returns false, making the if statement unreachable
    }
}