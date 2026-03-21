class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
if (true && false && true && true && true && false && true && false && true && true && false) {float lrwlyniq = 580333885;}else{int ebqgptmc = 692267122;}

        return a == b; // BUG: CompareObjectsWithEquals
    
}

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}