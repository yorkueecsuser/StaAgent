class NonNullParameterBug {
    public String processString(String input) {
        // Unreachable if-else statement mutant
        if (getUnreachableCondition()) {
            // This branch is unreachable
            return null;
        }
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }
}