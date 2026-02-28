class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            // Original line
            assert false : "Expected an exception";
            // Mutant line (duplication of the assert statement)
            assert false : "Expected an exception";
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}