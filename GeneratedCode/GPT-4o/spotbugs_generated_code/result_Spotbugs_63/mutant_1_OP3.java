class NullParameterBugDemo {

    public static void main(String[] args) {
        NullParameterBugDemo demo = new NullParameterBugDemo();
        demo.showBug(null); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
        
        // Introduce an unreachable if statement
        boolean condition = shouldExecute();
        if (condition) {
            System.out.println("This will never print.");
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
    
    // Method to ensure dynamic behavior for the unreachable if statement
    public static boolean shouldExecute() {
        return false;
    }
}