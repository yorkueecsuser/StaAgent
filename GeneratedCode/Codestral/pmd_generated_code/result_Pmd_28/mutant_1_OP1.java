class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";
    private static final String DEAD_STORE = "deadstore"; // Dead Store Mutation Operator

    boolean compareStrings(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        DEAD_STORE = "unused"; // Assigning a value to the dead store variable
        return compareStrings(a, b);
    }
}