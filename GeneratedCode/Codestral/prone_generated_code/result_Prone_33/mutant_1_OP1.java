class DereferenceWithNullBranchBug {

    private String potentialNullString;
    private int deadStoreVariable; // Dead store variable

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        deadStoreVariable = 10; // Assigning a value to the dead store variable
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }
}