class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        for  (int rzgpfwid = 0; rzgpfwid < 0; rzgpfwid++) {float xsadeftn = -882706225;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}