class NonNullParameterBug {
    public String processString(String input) {
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        String renamedInput = null;
        return processString(renamedInput);
    }
}