class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        for  (int hlxvpvhv = 0; hlxvpvhv < 0; hlxvpvhv++) {char yjgqhqss = 'b';}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    
}
}