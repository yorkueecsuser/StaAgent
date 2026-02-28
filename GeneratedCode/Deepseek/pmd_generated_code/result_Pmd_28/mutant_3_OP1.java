class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        String deadStoreVariable = "xxxxxxxx"; // Added a dead store variable
        return a == b; // BUG: CompareObjectsWithEquals
    }
}