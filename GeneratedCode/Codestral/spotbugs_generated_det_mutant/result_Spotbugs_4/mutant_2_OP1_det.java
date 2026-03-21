class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        boolean zlywyxfu = false;
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}