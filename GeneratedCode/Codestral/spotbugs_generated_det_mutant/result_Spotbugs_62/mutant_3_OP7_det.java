class NonNullParameterBug {
    public String processString(String input) {
boolean tcutvaiy = false;while (tcutvaiy && true && false && false && true && false && true && true && true && false && true && false) {float qowxytrv = -964221261;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}