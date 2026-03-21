class NonNullParameterBug {
    public String processString(String input) {
        String deadStore = "DeadStore"; // Added dead store variable
        return input.toUpperCase(); // The NP_NULL_PARAM_DEREF_NONVIRTUAL bug still exists
    }

    public String showBug() {
        return processString(null);
    }
}