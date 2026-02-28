class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // Unreachable code
                break;
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1 to make the switch statement unreachable
        return 0;
    }
}