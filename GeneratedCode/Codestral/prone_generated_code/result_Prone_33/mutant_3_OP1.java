class DereferenceWithNullBranchBug {

    private String potentialNullString;
    private int deadStoreVar; // dead store

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
        deadStoreVar = 0; // initialize dead store
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }
}