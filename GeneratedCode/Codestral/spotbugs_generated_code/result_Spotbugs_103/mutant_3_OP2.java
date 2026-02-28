class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            int length = ((String) obj).length(); // Duplicated line
            return ((String) obj).toUpperCase();
        }
        int length = 0; // Added to avoid compilation error due to duplication
        throw new IllegalArgumentException("Object is not a String");
    }
}