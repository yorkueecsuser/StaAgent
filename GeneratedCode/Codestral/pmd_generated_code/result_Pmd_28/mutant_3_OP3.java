class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        // Inserted unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }

    // Dummy method to return false during runtime
    private boolean getCondition() {
        return false;
    }
}