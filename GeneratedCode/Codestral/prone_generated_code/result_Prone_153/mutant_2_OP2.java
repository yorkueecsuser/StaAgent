class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Duplication of the applicable assignment statement
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // Mutant code
        }
        // Process the arguments in pairs
    }
}