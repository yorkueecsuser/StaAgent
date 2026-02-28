class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments");
        }

        // Mutation: Unreachable switch statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable switch statement executed.");
                    break;
            }
        }

        // Process the arguments in pairs
    }

    private int getValue() {
        return 0; // This value is never used in the switch statement
    }
}