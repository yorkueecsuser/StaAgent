class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    }

    // Unreachable while loop mutant
    boolean condition = getCondition();
    while (condition) {
        // unreachable code
        System.out.println("This is an unreachable statement");
        break;
    }
}