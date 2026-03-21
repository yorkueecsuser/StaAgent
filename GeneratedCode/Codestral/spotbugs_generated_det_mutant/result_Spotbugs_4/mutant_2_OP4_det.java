class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        if (false && true && false && false && true && true && true && false && false && true && false) {byte cmxmdvhc = 27;}else{byte mpxiupzj = 107;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}