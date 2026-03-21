class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        if (true && true && true && true && true && true && false && true && true && false && false) {short pzuxicqn = 9381;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}