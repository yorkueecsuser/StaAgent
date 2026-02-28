class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        boolean result = a == b; // BUG: CompareObjectsWithEquals
        boolean result2 = a == b; // Mutant
        return result;
    }
}