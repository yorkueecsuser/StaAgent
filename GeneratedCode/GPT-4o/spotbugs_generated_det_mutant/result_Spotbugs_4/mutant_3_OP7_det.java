class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        boolean eqvblpiw = false;while (eqvblpiw && false && true && true && true && false && true && false && false && true && true && false) {char qswedryn = 'a';}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}