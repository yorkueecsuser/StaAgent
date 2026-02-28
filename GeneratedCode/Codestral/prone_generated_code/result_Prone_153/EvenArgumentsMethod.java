class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }

        // Added unreachable while loop
        boolean loopCondition = false;
        while (loopCondition) {
            System.out.println("This should never print");
        }

        // Process the arguments in pairs
    }
}