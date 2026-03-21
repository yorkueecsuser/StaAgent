class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        for  (int oaaawrbv = 0; oaaawrbv < 0; oaaawrbv++) {long pxitayia = 688993065;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}