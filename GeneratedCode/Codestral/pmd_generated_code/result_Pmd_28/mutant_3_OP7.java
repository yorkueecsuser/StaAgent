class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean unreachableCondition = getUnreachableCondition(); // Method call to generate condition
        while (unreachableCondition) { // Unreachable while loop
            System.out.println("This should never be printed");
        }
        return a == b;
    }

    private boolean getUnreachableCondition() {
        return false; // Always false to make the loop unreachable
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}