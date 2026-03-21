class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // Original bug: A parameter is dead upon entry to a method but overwritten

        boolean condition = false;
        for (int i = 0; condition; i++) { // Mutant code: Unreachable for loop
            System.out.println("This loop is unreachable");
        }

        return input;
    }
}