class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        boolean condition = false;
        if (condition) {
            // This code is unreachable because the condition is always false
            return a == b; // BUG: CompareObjectsWithEquals
        }
        return false;
    }
}