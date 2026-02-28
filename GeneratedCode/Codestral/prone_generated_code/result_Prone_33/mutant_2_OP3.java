class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        int length = potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null

        // Mutant: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This statement is unreachable");
        }

        return length;
    }

    private boolean getFalseCondition() {
        return false;
    }
}