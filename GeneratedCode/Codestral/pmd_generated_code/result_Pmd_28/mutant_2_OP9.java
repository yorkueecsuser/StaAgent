class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        return a!= b; // Mutant: replaced "==" with "!=" to maintain the bug
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}