class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
if (true && false && true && false && false && true && true && false && true && true && false) {long fpyrbird = 452688483;}

        return a == b; // BUG: CompareObjectsWithEquals
    
}

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}