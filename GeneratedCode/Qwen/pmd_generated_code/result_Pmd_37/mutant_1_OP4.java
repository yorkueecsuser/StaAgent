class FinallyBlockException {

    public String showBug() {
        try {
            // Simulate some operation that might throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
            return String.valueOf(result);
        } catch (ArithmeticException e) {
            // Handle the arithmetic exception
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            return "Handled ArithmeticException";
        } finally {
            // Throwing an exception in the finally block
            boolean shouldRun = getCondition(); // Dynamically determined condition
            if (shouldRun) {
                // This block is unreachable because shouldRun is always false
                System.out.println("This is an unreachable if block");
            } else {
                // This block is also unreachable because shouldRun is always false
                System.out.println("This is an unreachable else block");
            }
            throw new RuntimeException("Exception from finally block"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        FinallyBlockException example = new FinallyBlockException();
        try {
            example.showBug();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}