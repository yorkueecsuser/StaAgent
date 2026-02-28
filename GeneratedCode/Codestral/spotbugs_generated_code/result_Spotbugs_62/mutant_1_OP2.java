class NonNullParameterBug {
    public String processString(String input) {
        String duplicatedInput = input; //duplication of assignment statement
        return duplicatedInput.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}