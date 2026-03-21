class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        boolean bholjmqb = false;while (bholjmqb && false && false && true && true && true && false && true && false && true && true && false) {long tokgxqbf = 147068016;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}