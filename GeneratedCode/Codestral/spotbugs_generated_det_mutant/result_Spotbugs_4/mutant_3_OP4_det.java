class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        if (false && true && false && false && true && true && true && false && false && true && false) {long jpnxjtuu = -631218573;}else{int xkewpqxp = 158407325;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}