class NonNullParameterBug {
    public String processString(String input) {
for  (int mkjgafll = 0; mkjgafll < 0; mkjgafll++) {short gbcemiye = 5591;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}