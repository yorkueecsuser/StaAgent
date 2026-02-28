class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        return a == b; // Original code

        // Added unreachable while loop based on the Mutation Operator Information
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line should never execute.");
        }
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}