class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean result = a == b;
        // Mutant: Duplicate the assignment statement
        boolean anotherResult = a == b;
        return result;
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}