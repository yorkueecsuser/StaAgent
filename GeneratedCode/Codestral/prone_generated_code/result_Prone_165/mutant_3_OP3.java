class TryFailThrowableBug {
    public boolean showBug(int number) {
        boolean unreachableCondition = false;
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            if (unreachableCondition) {
                // Mutant: Unreachable if statement
                System.out.println("This code should never be executed");
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}