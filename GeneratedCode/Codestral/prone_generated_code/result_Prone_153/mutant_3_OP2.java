class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Duplicated assignment statement
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }
        // Process the arguments in pairs
    }
}