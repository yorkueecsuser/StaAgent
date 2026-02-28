class NullParameterBugDemo {

    public static void main(String[] args) {
        NullParameterBugDemo demo = new NullParameterBugDemo();
        demo.showBug(null); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)

        // Inserting an unreachable if-else statement
        boolean condition = getRuntimeCondition();
        if (condition) {
            System.out.println("This code is reachable but condition is always false.");
        } else {
            System.out.println("This code is unreachable because condition is always false.");
        }
    }

    private static boolean getRuntimeCondition() {
        return false; // This makes the if-else branch unreachable
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
}