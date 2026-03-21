class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        double alqnnkha = -844040246;
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}