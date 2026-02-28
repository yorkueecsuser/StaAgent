class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
        for (int i = 0; false; i++) {
            // Added unreachable for loop to ensure mutant remains unreachable
        }
    }
}