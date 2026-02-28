class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }
}

// Mutant code
class MutantA {
    public boolean equalsTestMutant(String c, String d) {
        return c == d; // Mutant: Renaming
    }
}