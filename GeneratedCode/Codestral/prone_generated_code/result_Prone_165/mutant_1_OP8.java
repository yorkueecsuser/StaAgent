class TryFailThrowableBug {
    public boolean showBug(int nmbr) {
        try {
            if (nmbr < 0) {
                throw new ArithmeticException("Number is negative");
            }
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}