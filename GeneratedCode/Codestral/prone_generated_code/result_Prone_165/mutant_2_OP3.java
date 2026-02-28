class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            // Mutated code: Inserted unreachable if statement
            boolean isUnreachable = false;
            if (isUnreachable) {
                System.out.println("This code should never be executed");
            }
            assert false : "Expected an exception";
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}