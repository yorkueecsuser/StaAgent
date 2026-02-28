class DeadParameterBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int input) {
        input = 10; // Original bug: the parameter 'input' is dead upon entry to this method but overwritten

        // Mutation: Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This code block will never execute");
        } else {
            // This else block is unreachable due to the condition always being false
            System.out.println("This code block is unreachable");
        }

        return input;
    }
}