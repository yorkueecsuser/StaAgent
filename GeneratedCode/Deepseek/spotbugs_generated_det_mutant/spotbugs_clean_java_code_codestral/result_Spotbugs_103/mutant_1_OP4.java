class UnnecessaryTypeCheck {
    private static boolean getFalse() {
        return false;
    }

    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        }
        boolean shouldRun = getFalse();
        if (shouldRun) {
            throw new IllegalArgumentException("This line should never be reached");
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}