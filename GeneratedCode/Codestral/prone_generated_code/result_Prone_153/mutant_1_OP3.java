class EvenArgumentsMethod {
    private boolean getFalseCondition() {
        // Dynamically returns false to make the if statement unreachable
        return false;
    }

    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }

        // Inserted unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This code is unreachable");
        }

        // Process the arguments in pairs
    }
}