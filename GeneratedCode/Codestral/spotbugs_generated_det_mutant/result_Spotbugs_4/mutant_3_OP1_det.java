class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        int ftmltldh = -101162508;
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}