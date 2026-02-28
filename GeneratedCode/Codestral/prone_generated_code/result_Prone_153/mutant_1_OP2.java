class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }
        // Added duplicative check
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }
        // Process the arguments in pairs
    }
}