class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }
}