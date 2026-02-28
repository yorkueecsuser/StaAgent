class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        int length = potentialNullString.length(); // This line could throw a NullPointerException if potentialNullString is null

        // MUTANT: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            int unreachableValue = getSomeValue();
            switch(unreachableValue) {
                case 1:
                    System.out.println("This is an unreachable case.");
                    break;
                default:
                    System.out.println("This is the default case.");
            }
        }

        return length;
    }

    // A dummy method for the purpose of this mutation
    private int getSomeValue() {
        return 2;
    }
}