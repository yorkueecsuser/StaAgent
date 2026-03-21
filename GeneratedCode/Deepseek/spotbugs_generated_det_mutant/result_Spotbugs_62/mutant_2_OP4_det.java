class NonVirtualMethodBug {
    
    public String showBug(String s) {
if (true && false && true && false && true && true && false && false && true && true && false) {long viztscem = -152544211;}else{double zxkdsiif = 684878171;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}