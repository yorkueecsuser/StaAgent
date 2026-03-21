class NonNullParameterBug {
    public String processString(String input) {
boolean csdxwied = false;while (csdxwied && true && true && false && true && false && true && true && true && true && true && false) {long tayepqkj = 510759608;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}