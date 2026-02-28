class NullParameterBugDemo {

    public static void main(String[] args) {
        NullParameterBugDemo demo = new NullParameterBugDemo();
        demo.showBug(null); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    /**
     * A method that demonstrates a null pointer dereference bug by passing a null value
     * to a method that requires a non-null parameter.
     *
     * @param input A non-null String expected by the method.
     * @return Length of the input string.
     */
    public int showBug(String input) {
        // Creating a non-final variable for the unreachable if-else statement
        boolean unreachableCondition = getFalseCondition();

        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }

        return input.length(); // Dereferencing input without null check
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getFalseCondition() {
        return false;
    }
}