class DereferenceWithNullBranchBug {

    private String potentialNullString;
    private String r; // Mutant code: Renaming the variable

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
        this.r = potentialNullString; // Mutant code: Assigning value to the new variable
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
        // Mutant code: Additional check for the new variable
        if (r!= null) {
            return r.length();
        } else {
            return 0; // Returning default value to avoid NullPointerException
        }
    }
}