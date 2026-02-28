class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            // Added unreachable for loop
            boolean condition = getCondition();
            for (int i = 0; condition; i++) {
                // This code is unreachable
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }

    // Method to return false, ensuring the unreachable for loop condition is always false
    private boolean getCondition() {
        return false;
    }
}