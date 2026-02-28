class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    }
}

class MutantCode {
    // MUTANT: UseEqualsToCompareStrings
    public boolean showMutant(String r1, String r2) {      // Renaming of variable s1 and s2 to r1 and r2 respectively
        if (r1 == "one") return true;                       // Renaming of variable s1 and s2 to r1 and r2 respectively
        if ("two".equals(r2)) return true;                  // Renaming of variable s1 and s2 to r1 and r2 respectively
        return false;
    }
}