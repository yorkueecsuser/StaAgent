class NonNullParameterBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String processString(String input) {
        // Adding the unreachable while loop
        while (getFalseCondition()) {
            // This loop is unreachable as the condition is always false
            System.out.println("This is an unreachable loop");
        }
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}