class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        if (true && false && false && false && true && true && true && false && true && true && false) {int gciqwrlw = 927352520;}else{short hcfnnnwq = 8798;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}