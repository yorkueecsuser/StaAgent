class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        return potentialNullString.length();
    }

    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }
}