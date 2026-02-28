class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
            assert false : "Expected an exception"; // Mutant: Duplicate the assert statement
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}