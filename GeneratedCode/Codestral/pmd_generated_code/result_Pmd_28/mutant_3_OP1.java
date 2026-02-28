class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";
    private static final String DEAD_STORE = "deadstore"; // Dead Store

    boolean compareStrings(String a, String b) {
        return a == b;
    }

    public boolean showBug(String a, String b) {
        String unusedVariable = DEAD_STORE; // Unused variable declaration (Dead Store)
        return compareStrings(a, b);
    }
}