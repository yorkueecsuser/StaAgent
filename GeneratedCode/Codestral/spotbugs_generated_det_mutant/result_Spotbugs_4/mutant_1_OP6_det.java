class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        for  (int cfjyvrgj = 0; cfjyvrgj < 0; cfjyvrgj++) {char olmffbhd = 'y';}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}