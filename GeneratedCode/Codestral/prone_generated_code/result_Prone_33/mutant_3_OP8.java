class DereferenceWithNullBranchBug {

    private String potentialNullString;
    private String renamedString;  // Mutant: Renamed variable

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
        this.renamedString = potentialNullString;  // Mutant: Assigned the value to the renamed variable
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null

        // Mutant: Added a new block of code with the renamed variable
        if (renamedString!= null) {
            return renamedString.length();
        } else {
            return 0; // Or any suitable value to handle the null case
        }
    }
}