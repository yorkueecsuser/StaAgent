class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    private boolean getFalseCondition() {
        return false;
    }

    boolean compareStrings(String a, String b) {
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
        return a == b;
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}