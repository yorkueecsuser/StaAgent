class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        boolean shouldCheckLength = false;
        if (shouldCheckLength) {
            // Unreachable code
            return 0;
        } else {
            // Original code
            return potentialNullString.length();
        }
    }

    private boolean getCondition() {
        // This method should be replaced with a dynamic condition check
        return false;
    }
}