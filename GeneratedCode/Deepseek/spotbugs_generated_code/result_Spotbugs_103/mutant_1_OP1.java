class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) { // Original buggy line
            int unusedVariable; // Dead store (unused variable declaration)
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}