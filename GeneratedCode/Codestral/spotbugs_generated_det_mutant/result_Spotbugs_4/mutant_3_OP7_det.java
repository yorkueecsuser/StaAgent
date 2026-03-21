class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        boolean apbphcpb = false;while (apbphcpb && false && true && false && false && true && false && true && true && false && true && false) {long suifmdhd = -975453154;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}