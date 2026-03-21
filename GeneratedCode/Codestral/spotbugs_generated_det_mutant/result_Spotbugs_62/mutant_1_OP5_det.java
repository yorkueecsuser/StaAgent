class NonNullParameterBug {
    public String processString(String input) {
int bqkhqaoh = 0;switch  (bqkhqaoh) {case 1:byte ezyqvsjc = -121;break;default:String mxzsdwyv = "fkknpcfu";break;}

        return input.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public String showBug() {
        return processString(null);
    }
}