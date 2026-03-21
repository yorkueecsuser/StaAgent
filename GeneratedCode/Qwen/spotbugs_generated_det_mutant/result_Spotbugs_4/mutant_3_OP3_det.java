class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        if (true && true && true && false && true && false && false && false && false && true && false) {boolean dzdcdcci = true;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}