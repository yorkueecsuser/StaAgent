class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            assert false : "Expected an exception"; // Original code

            // Mutated code (unreachable if-else branch)
            boolean condition = getCondition();
            if (condition) {
                // This code is unreachable
                System.out.println("Unreachable code executed");
            } else {
                System.out.println("This is the else part of the unreachable branch");
            }
        } catch (Throwable t) {
            return true;
        }
        return false;
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
    }
}