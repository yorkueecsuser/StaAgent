class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        // Original bug: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        int result = value & value;

        // Mutated code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        } else {
            // This else branch is unreachable
            result = value - value;
        }
        return result;
    }
}