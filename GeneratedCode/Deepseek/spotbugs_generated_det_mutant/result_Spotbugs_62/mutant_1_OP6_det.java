class NonVirtualMethodBug {
    
    public String showBug(String s) {
for  (int ujzinriu = 0; ujzinriu < 0; ujzinriu++) {double crredtii = -179810030;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}