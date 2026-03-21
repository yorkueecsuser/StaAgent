class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        for  (int stowurgz = 0; stowurgz < 0; stowurgz++) {boolean tqyetngh = true;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}