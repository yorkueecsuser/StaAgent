class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // Original code:
        int length = potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null

        // Mutated code:
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code executed!");
        } else {
            // This else block is unreachable because getUnreachableCondition() always returns false
            System.out.println("This should never be executed!");
        }

        return length;
    }

    // This method is used to dynamically determine the condition of the if-else statement
    private boolean getUnreachableCondition() {
        return false;
    }
}