class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        boolean unreachableCondition = isUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should never execute");
        }
        return potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null
    }

    private boolean isUnreachableCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }
}