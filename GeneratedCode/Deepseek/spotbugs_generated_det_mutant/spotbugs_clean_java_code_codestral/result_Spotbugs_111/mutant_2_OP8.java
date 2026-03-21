class DeadParameterBug {
    public int showBug(int input) {
        int renamedInput = input; // New variable renamedInput is introduced
        renamedInput = 10; // The new variable is overwritten, keeping the original bug intact
        return renamedInput;
    }
}