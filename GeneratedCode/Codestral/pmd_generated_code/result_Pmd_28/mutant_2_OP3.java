class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        if (unreachableCondition()) {
            // Unreachable if branch
            System.out.println("This is an unreachable branch");
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }

    private boolean unreachableCondition() {
        // This method returns false to make the if branch unreachable
        return false;
    }
}