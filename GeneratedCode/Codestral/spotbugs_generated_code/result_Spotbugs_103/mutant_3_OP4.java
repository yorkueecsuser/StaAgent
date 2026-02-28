class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        }
        // Mutant Code: Unreachable if-else branch
        boolean condition = getCondition();
        if (!condition) {
            return null; // This code will never execute
        } else {
            throw new IllegalArgumentException("Object is not a String");
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the branch unreachable
    }
}