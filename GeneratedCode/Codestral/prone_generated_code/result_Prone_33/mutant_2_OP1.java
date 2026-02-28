class DereferenceWithNullBranchBug {

    private String potentialNullString;
    private String deadStoreVariable; // Dead Store mutation: Adding an unused variable

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
        this.deadStoreVariable = "unused"; // Initializing the dead store variable
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }
}