class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            // Mutation: Unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("Unreachable code block");
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}