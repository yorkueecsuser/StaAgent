class EvenArgumentsMethod {
    private boolean unreachableCondition() {
        // This method returns false to make the if statement unreachable
        return false;
    }

    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }

        // Added unreachable if statement
        if (unreachableCondition()) {
            System.out.println("This code should never be executed");
        }

        // Process the arguments in pairs
    }
}