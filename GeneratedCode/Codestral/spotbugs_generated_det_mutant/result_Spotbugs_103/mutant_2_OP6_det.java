class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        for  (int bdnmtufm = 0; bdnmtufm < 0; bdnmtufm++) {String oeaiaovi = "bpemuuzy";}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}