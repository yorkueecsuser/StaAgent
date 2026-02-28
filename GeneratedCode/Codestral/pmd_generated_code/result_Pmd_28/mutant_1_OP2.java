class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        return a == b; // Original statement
        return a == b; // Duplicated statement
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}