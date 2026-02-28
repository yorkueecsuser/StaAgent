class EvenArgumentsMethod {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }
        // Process the arguments in pairs

        // Mutant code: Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This statement should never be executed.");
        } else {
            System.out.println("This is the else branch which is also unreachable.");
        }
    }
}