class NonNullParameterBug {
    public String processString(String input) {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable block
            return null;
        }
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }

    private boolean getCondition() {
        return false; // Always false to make the if statement unreachable
    }
}