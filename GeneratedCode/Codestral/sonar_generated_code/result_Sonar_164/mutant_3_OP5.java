class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutant: Unreachable switch statement
        boolean condition = false;
        int value = getValue();

        if (condition) {
            switch (value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
                default:
                    // This code will also never be executed
                    System.out.println("Default unreachable code");
            }
        }

        return false;
    }

    private int getValue() {
        // This method is used to simulate a dynamic value for the switch statement
        // In a real-world scenario, this could be a method that retrieves a value from a database, user input, etc.
        return 0; // always return 0 for the purposes of this mutant
    }
}