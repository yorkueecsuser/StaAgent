class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (false && true && true && false && false && true && false && false && false && false && false) {int qaidmsqq = -823306420;}else{short uazgnpsx = 6245;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}