class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }
}