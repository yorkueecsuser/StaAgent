class EvenArgumentsMethod {
    private int getUnreachableValue() {
        return -1;  // Always returning a value that can't be matched in the switch statement
    }

    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }

        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code executed");
                break;
        }
        // Process the arguments in pairs
    }
}