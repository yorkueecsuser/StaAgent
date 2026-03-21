class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        if (true && true && false && true && true && false && false && true && false && true && false) {float lcqlceho = 764195725;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}