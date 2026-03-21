class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        boolean vtschpcy = false;while (vtschpcy && false && true && false && true && true && true && false && false && false && true && false) {String gojjxwvq = "sfvmzbue";}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}