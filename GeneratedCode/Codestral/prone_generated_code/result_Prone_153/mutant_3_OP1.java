class EvenArgumentsMethod {
    public void showBug(String... args) {
        int deadStoreVariable; // Adding a dead store variable
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }
        // Process the arguments in pairs
    }
}