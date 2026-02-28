class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        int result = value & value;

        // MUTATION: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println("This is the else block of the unreachable if-else statement.");
        }

        return result;
    }

    // This method returns false to ensure the if-else branch is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}