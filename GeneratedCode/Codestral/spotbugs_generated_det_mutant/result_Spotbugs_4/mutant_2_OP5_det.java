class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        int bmfmtlos = 0;switch  (bmfmtlos) {case 1:String wsolbktn = "vpgsdaea";break;default:short pmhixxss = -9080;break;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}