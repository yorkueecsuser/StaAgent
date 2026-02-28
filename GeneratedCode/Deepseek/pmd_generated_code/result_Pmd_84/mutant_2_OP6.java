class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    }

    // Mutant Code: Unreachable for loop
    public void unreachableForLoop() {
        for (int i = 1; i == 2; i++) {
            System.out.println("Inside unreachable for loop, i value: " + i);
        }
    }
}