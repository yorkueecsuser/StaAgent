class UnnecessaryTypeCheck {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        } else if (getUnreachableCondition()) {
            // Unreachable mutant code
            return new Object();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}