class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toUpperCase(); // Original statement
            // Mutant: Duplicate the return statement
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}