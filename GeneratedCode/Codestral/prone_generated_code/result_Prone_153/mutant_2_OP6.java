class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }

        // Mutant: Inserting an unreachable for loop
        boolean shouldLoop = getCondition();
        for (int i = 0; shouldLoop; i++) {
            // This loop will never be executed because the condition is always false
            System.out.println("Unreachable code");
        }

        // Process the arguments in pairs
    }

    // A helper method to return a false condition
    private boolean getCondition() {
        return false;
    }
}