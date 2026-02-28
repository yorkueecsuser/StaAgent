class NonNullParameterBug {
    public String processString(String input) {
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter
    }

    public String showBug() {
        // Equivalent Loop Replacement mutation operator is not applicable as there are no loops in the code.
        return processString(null);
    }
}