class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        if (getCondition()) {
            for (int i = 0; false; i++) {
                // This loop is unreachable
            }
        }
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }

    private boolean getCondition() {
        return false; // This condition is always false, making the loop unreachable
    }
}