class BuggyCode {
    private boolean condition; // New variable

    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // Unchanged
        if ("two".equals(s2)) return true;   // Unchanged

        // Mutation: Added an unreachable for loop
        for (int i = 0; false; i++) {    // This loop is unreachable, condition is always false
            System.out.println("Unreachable loop");
        }

        return false;
    }
}