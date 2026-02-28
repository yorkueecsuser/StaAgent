class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // Original code
        int length = potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null

        // Mutated code: Unreachable switch statement
        switch (unreachableCondition()) {
            case 1:
                System.out.println("This is an unreachable case.");
                break;
        }

        return length;
    }

    private int unreachableCondition() {
        // This method always returns a value that is not 1 to make the switch statement unreachable
        return 2;
    }
}