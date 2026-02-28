class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch

        // Mutated code: adding an unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("Unreachable code");
        }

        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the loop unreachable
        return false;
    }
}