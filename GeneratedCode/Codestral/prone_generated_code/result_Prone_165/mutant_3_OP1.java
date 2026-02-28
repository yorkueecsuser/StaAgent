class TryFailThrowableBug {
    public boolean showBug(int number) {
        int deadStoreVariable; // added dead store mutant
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