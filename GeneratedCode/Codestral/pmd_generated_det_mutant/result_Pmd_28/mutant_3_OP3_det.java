class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
if (true && false && false && true && false && false && true && true && true && true && false) {int yghjgzia = -853308379;}

        return a == b; // BUG: CompareObjectsWithEquals
    
}

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}