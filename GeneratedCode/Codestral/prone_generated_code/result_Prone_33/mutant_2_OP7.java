class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        boolean unreachableCondition = isUnreachable();
        while (unreachableCondition) {
            // Unreachable while loop mutant
            System.out.println("This is an unreachable while loop");
        }
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }

    private boolean isUnreachable() {
        return false;
    }
}