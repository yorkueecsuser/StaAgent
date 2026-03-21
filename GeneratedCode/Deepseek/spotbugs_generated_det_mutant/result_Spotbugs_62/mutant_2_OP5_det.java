class NonVirtualMethodBug {
    
    public String showBug(String s) {
int nswreugi = 0;switch  (nswreugi) {case 1:String enhtcttk = "tdijiogb";break;default:char kkuncbkt = 'j';break;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}