class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            // Mutant: Unreachable while loop
            boolean conditionWhile = false;
            while (conditionWhile) {
                // This code is unreachable
                System.out.println("This is an unreachable while loop");
            }

            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}