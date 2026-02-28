class BuggyCode {
    boolean conditionFor = false;
    boolean shouldRunFor = false;

    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
        for (int i = 0; shouldRunFor; i++) {
            System.out.println("This is another unreachable loop.");
        }
        return false;
    }
}