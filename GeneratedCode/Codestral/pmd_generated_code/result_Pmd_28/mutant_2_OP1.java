class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";
    private static final String DEAD_STORE = "deadstore"; // added for Dead Store mutation

    boolean compareStrings(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        DEAD_STORE = "mutant"; // mutated line for Dead Store mutation
        return compareStrings(a, b);
    }
}