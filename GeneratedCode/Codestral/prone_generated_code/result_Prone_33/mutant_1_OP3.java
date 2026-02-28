class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        if (isUnreachable()) {
            throw new RuntimeException("Unreachable code");
        }
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }

    private boolean isUnreachable() {
        return false;
    }
}