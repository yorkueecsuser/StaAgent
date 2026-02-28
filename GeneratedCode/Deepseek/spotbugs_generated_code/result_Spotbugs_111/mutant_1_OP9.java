class DeadParameterBug {
    public int showBug(int input) {
        // Original code
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten

        // Mutant code (equivalent do-while loop)
        int counter = 0;
        do {
            counter++;
        } while (counter < 1); // This loop does nothing, it's just an equivalent replacement for the original line

        return input;
    }
}