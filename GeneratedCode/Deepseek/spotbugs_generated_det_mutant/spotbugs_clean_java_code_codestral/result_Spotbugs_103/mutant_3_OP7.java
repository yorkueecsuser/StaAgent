class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        while (getFalseCondition()) { // Added unreachable while loop
            // This block of code is unreachable
        }
        if (obj instanceof String) { // Original bug: SIO: Unnecessary type check done using instanceof operator
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    // Method to return false dynamically
    private boolean getFalseCondition() {
        return false;
    }
}