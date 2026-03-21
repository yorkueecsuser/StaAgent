class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        if (true && true && true && false && false && true && false && false && false && true && false) {long lgbgvcsm = -991487387;}else{String skncrkhw = "cohgvwxv";}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}