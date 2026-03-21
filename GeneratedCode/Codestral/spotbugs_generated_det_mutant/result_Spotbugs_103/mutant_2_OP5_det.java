class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        int kdyjvzzv = 0;switch  (kdyjvzzv) {case 1:String ddfkpdya = "mahwfdyk";break;default:double iovffqcw = -891834147;break;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}