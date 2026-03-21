class NonNullParameterBug {
    public String processString(String input) {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }

    public String showBug() {
        return processString(null);
    }
}