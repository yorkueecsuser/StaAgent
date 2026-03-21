class NonVirtualMethodBug {
    
    public String showBug(String s) {
int bbcjpaab = 0;switch  (bbcjpaab) {case 1:double znegeqkp = 16103795;break;default:char yjnobmid = 'o';break;}

        return s.toUpperCase(); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}

    public static void main(String[] args) {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        System.out.println(n.showBug(null));
    }
}