class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        boolean condition = false;
        while(condition) {
            // unreachable code
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }
}