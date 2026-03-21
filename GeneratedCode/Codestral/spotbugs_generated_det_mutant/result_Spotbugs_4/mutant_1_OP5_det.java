class UnresolvableReferenceBug {
    public Object showBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        int kxwjolxo = 0;switch  (kxwjolxo) {case 1:long llgggnjl = 700889645;break;default:String kvrgukvg = "gabygqso";break;}
        NonExistentClass nonExistentClass = new NonExistentClass();
        return nonExistentClass;
    
}
}