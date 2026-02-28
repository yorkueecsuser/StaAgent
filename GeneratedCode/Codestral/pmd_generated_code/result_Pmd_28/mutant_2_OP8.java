class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        String x = a; // Renamed variable `a` to `x`
        return x == b;
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}