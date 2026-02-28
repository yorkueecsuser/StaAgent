class NonNullParameterBug {
    public String processString(String input) {
        return input.toUpperCase(); // Original bug
    }

    public String showBug() {
        processString(null); // Original bug invocation
        return processString(null); // Duplicated bug invocation
    }
}