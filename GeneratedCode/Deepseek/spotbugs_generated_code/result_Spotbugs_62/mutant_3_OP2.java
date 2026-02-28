class NonNullParameterBug {
    public String processString(String input) {
        String processedInput = input;
        processedInput = processedInput; // Added mutant code to duplicate the assignment
        return processedInput.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}