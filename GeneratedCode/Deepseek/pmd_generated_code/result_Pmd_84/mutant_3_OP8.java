class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    }
}

class MutatedCode {
    // Mutated line (s1 == "one") to (s1 == "one_mutant")
    public boolean showBug_1(String s1, String s2) {
        if (s1 == "one_mutant") return true;        // Mutated line
        if ("two".equals(s2)) return true;   // Original line
        return false;
    }

    // Mutated line ("two".equals(s2)) to ("two_mutant".equals(s2))
    public boolean showBug_2(String s1, String s2) {
        if (s1 == "one") return true;        // Original line
        if ("two_mutant".equals(s2)) return true;   // Mutated line
        return false;
    }
}