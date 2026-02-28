class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // Original bug
        input = 10; // Mutation: Duplicate the assignment statement
        return input;
    }
}