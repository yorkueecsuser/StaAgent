class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        // Inserted unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will never execute
        }

        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    // Dummy method to provide a false condition
    private boolean getCondition() {
        return false;
    }
}