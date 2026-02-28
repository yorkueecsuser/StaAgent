class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        int result = value & value;

        // MUTANT: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            switch (value) {
                case 1:
                    System.out.println("This line should be unreachable");
                    break;
                default:
                    System.out.println("This line should also be unreachable");
            }
        }

        return result;
    }
}