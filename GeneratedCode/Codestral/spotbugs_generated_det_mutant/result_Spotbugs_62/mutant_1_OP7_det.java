class NonNullParameterBug {
    public String processString(String input) {
boolean ntmrnthc = false;while (ntmrnthc && false && false && true && false && false && false && false && true && false && true && false) {boolean pfmdanbv = false;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}