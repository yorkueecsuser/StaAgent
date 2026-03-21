class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        if (false && false && true && true && false && true && true && true && true && true && false) {byte odnngvqv = -10;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}