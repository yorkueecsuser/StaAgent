class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }

        // Mutant Code: Added an unreachable while loop
        boolean unreachableCondition = false;
        while (getUnreachableCondition()) {
            System.out.println("This is an unreachable code block");
        }

        // Process the arguments in pairs
    }

    private boolean getUnreachableCondition() {
        return unreachableCondition;
    }
}