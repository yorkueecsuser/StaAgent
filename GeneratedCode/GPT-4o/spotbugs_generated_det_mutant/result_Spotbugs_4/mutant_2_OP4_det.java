class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        if (false && true && true && false && false && true && true && true && true && true && false) {long llezovep = 1672786;}else{byte oiptmxpt = -36;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}