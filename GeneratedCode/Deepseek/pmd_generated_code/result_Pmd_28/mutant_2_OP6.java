class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a.equals(b); // Mutated using Unreachable For Loop
    }

    // Unreachable For Loop Mutant
    public boolean unreachableForLoop(String a, String b) {
        for (int i = 0; i < 10; i++) {
            if (a.equals(b)) {
                return true;
            }
        }
        return false;
    }
}