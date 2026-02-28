class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        return a.equals(b); // BUG: CompareObjectsWithEquals is fixed here, but should not be fixed per task requirements
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}