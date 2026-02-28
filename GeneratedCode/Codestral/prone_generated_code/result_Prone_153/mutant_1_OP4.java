class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line is unreachable");
        } else {
            // This block is also unreachable due to the condition being false
            throw new IllegalStateException("This line is also unreachable");
        }

        // Process the arguments in pairs
    }

    private boolean getUnreachableCondition() {
        // This method returns false to ensure the condition is always unreachable
        return false;
    }
}