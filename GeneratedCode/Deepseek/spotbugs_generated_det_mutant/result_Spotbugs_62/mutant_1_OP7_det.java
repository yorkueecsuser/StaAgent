class NonVirtualMethodBug {
    
    public String showBug(String s) {
boolean lpgvypve = false;while (lpgvypve && false && false && false && true && true && true && true && false && false && true && false) {float gyemiqbj = 234927360;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}