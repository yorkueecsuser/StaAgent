class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean result = a == b; // Original assignment statement
        boolean duplicateResult = a == b; // Duplicated assignment statement
        return result;
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}