class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        boolean octyquqo = false;while (octyquqo && false && true && true && false && true && true && true && false && false && true && false) {int xovdmpyj = -570428164;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}