class NonVirtualMethodBug {
    
    public String showBug(String s) {
boolean kqsijsgp = false;while (kqsijsgp && false && true && true && false && false && true && false && false && false && false && false) {double amswkjgg = -76009331;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}