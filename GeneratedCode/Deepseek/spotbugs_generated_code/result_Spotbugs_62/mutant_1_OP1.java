class NonNullParameterBug {
    public String processString(String input) {
        String unusedVariable = "abcdefgh"; // Dead Store: Added unused variable
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}