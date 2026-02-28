class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // Original bug
        input = 10; // Mutated code: Duplication of the assignment statement
        return input;
    }
}