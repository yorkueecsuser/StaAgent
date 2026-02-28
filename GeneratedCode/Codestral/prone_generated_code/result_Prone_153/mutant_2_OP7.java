class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }

        // Unreachable while loop mutation
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable code block");
        }

        // Process the arguments in pairs
    }
}