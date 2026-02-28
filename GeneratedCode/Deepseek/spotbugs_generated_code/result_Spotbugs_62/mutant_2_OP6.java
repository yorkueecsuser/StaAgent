class NonNullParameterBug {
    private boolean getCondition() {
        return false;
    }

    public String processString(String input) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable for loop
        }
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}