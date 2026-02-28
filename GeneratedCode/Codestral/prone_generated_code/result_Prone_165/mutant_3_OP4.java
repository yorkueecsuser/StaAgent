class TryFailThrowableBug {
    public boolean showBug(int number) {
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) { // Unreachable if-else statement mutant
            System.out.println("This code block is unreachable");
        } else {
            // Alternative code path
        }

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

    private boolean getCondition() {
        // Implement your logic here to determine the condition dynamically
        return false; // For the sake of example, always return false to make the block unreachable
    }
}