class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable branch
            System.out.println("This branch is unreachable.");
        } else {
            // Original code
            return a == b;
        }
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}