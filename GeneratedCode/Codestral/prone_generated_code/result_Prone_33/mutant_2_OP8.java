class DereferenceWithNullBranchBug {

    private String potentialNullString;
    private String renamedPotentialNullString; // Mutant code added: Renaming the variable

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
        this.renamedPotentialNullString = potentialNullString; // Mutant code added: Assigning the value to the renamed variable
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length();
    }

    public int showMutantBug() {
        // Mutant code added: DereferenceWithNullBranch for the renamed variable
        return renamedPotentialNullString.length(); // This line could throw a NullPointerException if renamedPotentialNullString is null
    }
}