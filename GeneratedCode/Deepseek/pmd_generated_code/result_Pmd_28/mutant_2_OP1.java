class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        String mutant = "abcdefgh"; // Mutant added by Mutation Operator
        return a == b; // BUG: CompareObjectsWithEquals
    }
}