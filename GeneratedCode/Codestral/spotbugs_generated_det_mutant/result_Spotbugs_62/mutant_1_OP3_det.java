class NonNullParameterBug {
    public String processString(String input) {
if (false && true && true && true && true && true && true && true && false && false && false) {double fdxtxbzp = 751022027;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}