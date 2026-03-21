class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        boolean uuwvxfxg = false;while (uuwvxfxg && false && false && true && true && false && false && true && false && false && false && false) {char xajtmrur = 'r';}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}