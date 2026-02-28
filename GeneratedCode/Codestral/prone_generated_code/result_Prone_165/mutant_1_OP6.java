class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            // Inserted unreachable for loop
            for (int i = 0; getFalseCondition(); i++) {
                System.out.println("This loop is unreachable");
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }

    // Method to return false for the loop condition
    private boolean getFalseCondition() {
        return false;
    }
}