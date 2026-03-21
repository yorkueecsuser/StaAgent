class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
if (false && true && true && true && true && true && true && true && true && true && false) {float epvrtoww = 182731168;}

        return a == b; // BUG: CompareObjectsWithEquals
    
}

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}