class NonNullParameterBug {
    public String processString(String input) {
        String unusedVar = "abcdefgh"; // Dead store mutation
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}