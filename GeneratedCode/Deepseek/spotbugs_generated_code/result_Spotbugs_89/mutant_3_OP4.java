class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        // Original bug
        int result = value & value;

        // Mutation using Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This line should never be executed.");
        } else {
            System.out.println("This line should always be executed.");
        }

        return result;
    }
}