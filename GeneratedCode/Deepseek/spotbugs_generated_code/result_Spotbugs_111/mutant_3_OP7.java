class DeadParameterBug {
    public int showBug(int input) {
        boolean loopCondition = false;
        while (loopCondition) { // Mutant: Unreachable while loop
            input = 20; // This line will not be executed due to the unreachable while loop
        }
        input = 10; // Original bug: IP: A parameter is dead upon entry to a method but overwritten
        return input;
    }

    // This method is added for the purpose of the mutation operator.
    private boolean getCondition() {
        return false;
    }
}