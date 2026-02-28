class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean equalsTest2(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }
}