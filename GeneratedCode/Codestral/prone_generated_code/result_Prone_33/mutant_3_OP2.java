class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
        // Mutant Code: Duplication of assignment statement
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }
}