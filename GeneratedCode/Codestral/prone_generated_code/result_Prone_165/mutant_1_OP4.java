class TryFailThrowableBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }

            // Inserted unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This branch is unreachable
                System.out.println("This branch is unreachable");
            } else {
                assert false : "Expected an exception"; // BUG: TryFailThrowable
            }
        } catch (Throwable t) {
            return true;
        }
        return false;
    }
}