class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        int deadStoreVariable; // Dead store: Unused variable declaration
        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}