class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        String c = a; // Added a new variable 'c' with the same value as 'a'
        return c == b; // BUG: CompareObjectsWithEquals (Renamed 'a' to 'c')
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}