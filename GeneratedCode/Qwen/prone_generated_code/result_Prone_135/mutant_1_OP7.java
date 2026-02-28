class PreconditionsExample {

    public String showBug(int value) {
        // This line contains the bug as it uses %d instead of %s
        if (value < 0) {
            throw new IllegalArgumentException(String.format("Value must be non-negative: %d", value)); // BUG: PreconditionsInvalidPlaceholder
        }
        return "Valid value";
    }

    public static void main(String[] args) {
        PreconditionsExample example = new PreconditionsExample();
        try {
            example.showBug(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
    }

    // Method to provide a dynamic condition that is always false
    private static boolean getCondition() {
        return false;
    }
}