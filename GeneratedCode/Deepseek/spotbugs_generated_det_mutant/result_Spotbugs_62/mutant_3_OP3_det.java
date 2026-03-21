class NonVirtualMethodBug {
    
    public String showBug(String s) {
if (false && true && false && true && true && true && false && false && true && true && false) {String wrjzbvjt = "tmizfiqd";}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}