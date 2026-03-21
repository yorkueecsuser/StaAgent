class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        if (true && true && true && true && false && false && false && false && false && false && false) {long ecxyzdmy = -154582531;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}