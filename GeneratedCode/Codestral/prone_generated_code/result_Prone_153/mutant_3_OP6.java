class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }

        // Inserted unreachable for loop
        boolean condition = getCondition();
        for (int i = 0;!condition; i++) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        // Process the arguments in pairs
    }

    private boolean getCondition() {
        // This method returns false to make the loop condition always false
        return false;
    }
}