class CompareObjectsWithEquals {
    public boolean equalsTest(String c, String d) {
        return c == d; // BUG: CompareObjectsWithEquals
    }
}