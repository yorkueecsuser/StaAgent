class EvenArgumentsMethod {
    public void showBug(String... args) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            throw new IllegalStateException("This code should not be executed");
        }

        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }
        // Process the arguments in pairs
    }
}