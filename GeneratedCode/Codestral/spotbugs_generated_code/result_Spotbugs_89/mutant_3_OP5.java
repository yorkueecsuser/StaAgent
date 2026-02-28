class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        int result = value & value;

        // MUTANT: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            switch (value) {
                case 1:
                    System.out.println("This should never print.");
                    break;
                default:
                    break;
            }
        }

        return result;
    }
}