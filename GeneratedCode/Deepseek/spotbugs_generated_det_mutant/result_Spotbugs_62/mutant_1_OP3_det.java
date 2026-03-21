class NonVirtualMethodBug {
    
    public String showBug(String s) {
if (false && false && true && true && true && true && true && false && true && true && false) {byte qivfbzlf = -19;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}