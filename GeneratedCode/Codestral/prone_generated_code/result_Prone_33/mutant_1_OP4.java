class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        int length = potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null

        // MUTANT: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code executed!");
            return -1;
        } else {
            return length;
        }
    }
}