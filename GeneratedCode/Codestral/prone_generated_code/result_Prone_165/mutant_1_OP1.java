class TryFailThrowableBug {
    public boolean showBug(int number) {
        int unusedVariable; // Dead Store: Inserting an unused variable declaration
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}