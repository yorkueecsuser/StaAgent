class NonNullParameterBug {
    public String processString(String input) {
int kujizygo = 0;switch  (kujizygo) {case 1:float envnslvw = -113913226;break;default:char eaqcqsvs = 'c';break;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}