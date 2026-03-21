class NonVirtualMethodBug {
    
    public String showBug(String s) {
if (false && false && false && true && true && false && true && true && false && false && false) {double ooovkovw = -123861556;}else{double auygsxgk = -923043165;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}