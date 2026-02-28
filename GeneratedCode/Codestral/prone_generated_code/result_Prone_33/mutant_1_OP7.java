class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        boolean conditionWhile = falseCondition();
        while (conditionWhile) {
            // Unreachable while loop inserted by the mutation operator
        }
        // BUG: DereferenceWithNullBranch
        return potentialNullString.length();
    }

    private boolean falseCondition() {
        // This method always returns false to ensure the while loop is unreachable
        return false;
    }
}