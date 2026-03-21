class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        int aybnynut = 0;switch  (aybnynut) {case 1:boolean quechtko = true;break;default:char pzqrlbvh = 'n';break;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}