class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        String eyrylebd = "raqgrnuq";
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}