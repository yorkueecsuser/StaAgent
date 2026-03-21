class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (true && true && true && true && true && false && false && true && true && false && false) {float iwebjbbv = 762560256;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}