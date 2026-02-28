class NonNullParameterBug {
    private boolean getCondition() {
        return false;
    }

    public String processString(String input) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Inserted unreachable for loop
            System.out.println("This line is unreachable");
        }
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}