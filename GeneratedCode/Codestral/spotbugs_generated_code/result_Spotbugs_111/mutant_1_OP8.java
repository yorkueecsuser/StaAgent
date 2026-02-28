class DeadParameterBug {
    public int showBug(int input) {
        int renamedInput = 10; // Mutant: Renamed input variable to renamedInput
        return renamedInput;
    }
}