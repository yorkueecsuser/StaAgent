class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass();

        // Mutant code: Unreachable switch statement
        boolean isFalse = false;
        int value = getValue();
        if (isFalse) {
            switch (value) {
                case 1:
                    // This code will never be reached
                    System.out.println("Unreachable code");
                    break;
                default:
                    // This code will never be reached
                    System.out.println("Default case");
            }
        }

        return c;
    }

    // Method to get a value for the switch statement
    private int getValue() {
        return 0;
    }
}