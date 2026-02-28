class EvenArgumentsMethod {
    public void showBug(String... args) {
        int xyzabcdf; // Dead store
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    }
}