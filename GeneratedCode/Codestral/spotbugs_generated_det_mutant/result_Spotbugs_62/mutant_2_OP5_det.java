class NonNullParameterBug {
    public String processString(String input) {
int zqtmzmak = 0;switch  (zqtmzmak) {case 1:short soumjrpp = -5651;break;default:String drkmxrch = "algzqkes";break;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}