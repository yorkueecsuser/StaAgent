class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        boolean htodwxvn = false;while (htodwxvn && false && true && false && true && false && false && false && false && false && false && false) {char fkdlljot = 'j';}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}