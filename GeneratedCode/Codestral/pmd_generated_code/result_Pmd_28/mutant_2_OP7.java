class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        while (isFalse()) { // insert unreachable while loop
            // Empty body
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }

    private boolean isFalse() {
        return false; // method to return false
    }
}