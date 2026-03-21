class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        }
        if (isFalse()) { // Unreachable if statement
            throw new IllegalArgumentException("Unreachable code executed");
        }
        throw new IllegalArgumentException("Object is not a String");
    }
    private boolean isFalse() {
        return false;
    }
}