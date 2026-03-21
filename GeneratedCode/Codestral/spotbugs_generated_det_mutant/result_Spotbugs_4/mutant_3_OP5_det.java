class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        int ouqhlfhg = 0;switch  (ouqhlfhg) {case 1:short dkhsnhtc = 1500;break;default:long srtemnsk = -903213685;break;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}