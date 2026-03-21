class NonNullParameterBug {
    public String processString(String input) {
if (true && true && true && false && false && true && true && false && false && false && false) {float rumzosim = -21291282;}else{int szytdluc = 539407261;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}