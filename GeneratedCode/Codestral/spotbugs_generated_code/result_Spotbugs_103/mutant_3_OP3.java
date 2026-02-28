class UnnecessaryTypeCheck {
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(Object obj) {
        if (obj instanceof String) { // Original bug
            return ((String) obj).toUpperCase();
        }
        if (getFalseCondition()) { // Mutant: Unreachable if statement
            return null; // This line will never execute
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}