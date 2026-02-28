class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            assert false : "Expected an exception"; // Original code

            // Inserted mutant code
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("Unreachable code");
            }

        } catch (Throwable t) {
            return true;
        }
        return false;
    }

    // Method to simulate the condition for the while loop
    private boolean getCondition() {
        return false; // Always false to make while loop unreachable
    }
}