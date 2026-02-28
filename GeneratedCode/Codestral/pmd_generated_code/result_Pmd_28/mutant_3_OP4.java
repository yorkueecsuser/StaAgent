class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This line should not be executed.");
        } else {
            // Original Code
            return a == b;
        }
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}