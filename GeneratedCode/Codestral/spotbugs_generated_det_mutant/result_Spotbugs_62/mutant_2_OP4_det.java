class NonNullParameterBug {
    public String processString(String input) {
if (true && true && true && true && true && true && true && true && false && true && false) {String dlngdskp = "ovjushpl";}else{double urvtuhdj = 29753765;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}