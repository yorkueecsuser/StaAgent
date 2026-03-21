class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        if (false && true && true && false && false && true && false && false && false && false && false) {boolean fdtbtfkg = true;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}