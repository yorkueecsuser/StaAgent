class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        for  (int gpabsidp = 0; gpabsidp < 0; gpabsidp++) {int mtwruvmk = 206772309;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}