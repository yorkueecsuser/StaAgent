class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        int dyhfmfct = 0;switch  (dyhfmfct) {case 1:String uddhpmhm = "ztrjmmiy";break;default:char wvwwgwrt = 'c';break;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}