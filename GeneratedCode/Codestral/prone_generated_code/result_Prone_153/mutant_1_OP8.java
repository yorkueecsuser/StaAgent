class EvenArgumentsMethod {
    public void showBug(String... args) {
        String[] a = args;
        if (a.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    }
}