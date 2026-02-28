class TryFailThrowableBug {
    private boolean getFalseCondition() {
        // This method can be replaced with a more complex condition if needed
        return false;
    }

    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }

            // Mutant: Unreachable for loop
            for (int i = 0; getFalseCondition(); i++) {
                // This code will never be executed
            }

            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}