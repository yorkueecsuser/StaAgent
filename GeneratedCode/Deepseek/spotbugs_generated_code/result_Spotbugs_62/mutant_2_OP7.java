class NonNullParameterBug {
    private boolean getCondition() {
        return false;
    }

    public String processString(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This is an unreachable loop");
        }
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}