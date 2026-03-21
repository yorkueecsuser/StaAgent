class NonVirtualMethodBug {
    
    public String showBug(String s) {
int bjmvfmex = 0;switch  (bjmvfmex) {case 1:String oiscxlya = "yhusrqxc";break;default:short nwzmltqk = 203;break;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}