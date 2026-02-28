class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        int i = 0;
        do {
            if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
                return ((String) obj).toUpperCase();
            }
            i++;
        } while (i < 1);
        throw new IllegalArgumentException("Object is not a String");
    }
}