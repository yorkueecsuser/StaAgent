class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        boolean condition = false;
        if (condition) {
            // This is an unreachable mutant
            return true;
        } else {
            return a == b;
        }
    }
}