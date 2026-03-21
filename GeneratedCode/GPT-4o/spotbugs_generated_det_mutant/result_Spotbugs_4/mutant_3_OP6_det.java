class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        for  (int jsqrcrlt = 0; jsqrcrlt < 0; jsqrcrlt++) {byte upidtzej = -83;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}