class TryFailThrowableBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            if (getCondition()) { // Mutant code: Unreachable if statement
                System.out.println("This line will never be executed");
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}