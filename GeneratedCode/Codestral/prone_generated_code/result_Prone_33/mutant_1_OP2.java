class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        this.potentialNullString = this.potentialNullString; // Duplicated assignment statement
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }
}