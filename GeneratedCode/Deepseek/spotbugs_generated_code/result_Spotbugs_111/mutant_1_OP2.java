class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // Original assignment statement
        input = 10; // Added mutant: Duplicated assignment statement
        return input;
    }
}