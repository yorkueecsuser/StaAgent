class NonNullParameterBug {
    public String processString(String input) {
if (false && false && true && true && false && true && true && true && true && false && false) {char crhibjsd = 'd';}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}