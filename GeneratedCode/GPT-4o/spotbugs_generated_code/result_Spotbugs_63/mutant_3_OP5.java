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
        // Unreachable switch statement
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 9999:
                System.out.println("This code is unreachable.");
                break;
            default:
                break;
        }
        
        return input.length(); // Dereferencing input without null check
    }

    // Helper method to determine a value dynamically at runtime
    private int getUnreachableValue() {
        // Always returns a value that does not match any case in the switch
        return -1;
    }
}