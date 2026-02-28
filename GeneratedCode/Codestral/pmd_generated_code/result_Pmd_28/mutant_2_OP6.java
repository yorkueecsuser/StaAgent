class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean condition = alwaysFalse();
        for (int i = 0; condition; i++) {
            // This loop is unreachable because it will never be executed
            // However, this is a part of the mutation operator described
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }

    private boolean alwaysFalse() {
        // This method always returns false
        // This is to avoid using false directly in the loop condition
        return false;
    }
}