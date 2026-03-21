class NonNullParameterBug {
    public String processString(String input) {
if (false && true && true && false && false && false && false && true && false && false && false) {char gqbxuyqd = 'z';}else{char ekzolsaf = 'z';}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}