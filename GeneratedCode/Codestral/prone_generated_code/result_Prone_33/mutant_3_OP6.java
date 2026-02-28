class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        boolean condition = false;
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }
}