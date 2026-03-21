class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        boolean qqoovofg = false;while (qqoovofg && true && true && false && true && true && true && true && false && true && false && false) {String kiopldmi = "nfwpqnzy";}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}