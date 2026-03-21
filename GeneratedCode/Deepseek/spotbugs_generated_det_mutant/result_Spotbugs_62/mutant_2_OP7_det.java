class NonVirtualMethodBug {
    
    public String showBug(String s) {
boolean oxpxnjbd = false;while (oxpxnjbd && false && false && true && false && true && true && false && true && true && true && false) {boolean nojjjtty = false;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}