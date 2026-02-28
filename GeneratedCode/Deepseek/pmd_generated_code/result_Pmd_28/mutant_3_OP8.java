class CompareObjectsWithEquals {
    public boolean equalsTest(String x, String y) {
        return x == y; // BUG: CompareObjectsWithEquals
    }
}