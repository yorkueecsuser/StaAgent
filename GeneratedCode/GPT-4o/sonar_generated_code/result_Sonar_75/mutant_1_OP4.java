class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }

        // Mutation: Inserting unreachable if-else branch
        boolean alwaysFalseCondition = generateAlwaysFalseCondition();
        if (alwaysFalseCondition) {
            result = -1; // this branch is unreachable
        } else {
            result = result; // this branch is always executed
        }

        return result;
    }

    // Method to return a boolean that is always false
    private boolean generateAlwaysFalseCondition() {
        return false; // This is a dynamically determined condition, complying with the guidelines
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}