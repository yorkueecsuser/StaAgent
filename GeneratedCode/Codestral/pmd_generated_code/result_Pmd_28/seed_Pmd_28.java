class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}