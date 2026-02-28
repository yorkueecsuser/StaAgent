class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) { // Mutant code: Unreachable for loop
            System.out.println("This loop is unreachable");
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures that the loop is always unreachable
    }
}