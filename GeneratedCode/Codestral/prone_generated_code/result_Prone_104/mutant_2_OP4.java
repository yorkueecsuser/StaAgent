class MathRoundIntLongBug {

    public int showBug(long number) {
        // Original code
        int result = Math.round(number);

        // Mutation: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code should never run.");
        } else {
            // Alternative code
            result = (int) number; // This is just a placeholder alternative code. It may not be appropriate in all contexts.
        }

        return result;
    }

    // Method to provide dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }
}