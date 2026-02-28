class NullParameterExample {

    // Method that expects a non-null String parameter
    public int getStringLength(String str) {
        return str.length(); // This line will throw a NullPointerException if str is null
    }

    // Public method to demonstrate the bug
    public int showBug(String input) {
        return getStringLength(input); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        // Demonstrating the bug by passing null
        System.out.println(example.showBug(null));
    }

    // Mutated code starts here
    public int mutatedMethod(String a) {
        return getStringLength(a);
    }

    public static void mutatedMain(String[] b) {
        NullParameterExample c = new NullParameterExample();
        System.out.println(c.mutatedMethod(null));
    }
}