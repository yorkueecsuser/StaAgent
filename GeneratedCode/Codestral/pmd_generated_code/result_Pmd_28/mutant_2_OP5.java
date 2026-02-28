class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        int unreachableValue = -1;
        switch(unreachableValue) {
            case 1:
                // This is an unreachable block
                break;
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}