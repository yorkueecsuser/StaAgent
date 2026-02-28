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
            throw new RuntimeException("Exception from finally block"); // BUG: DoNotThrowExceptionInFinally

            // Inserting unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This is reachable code");
            } else {
                System.out.println("This is unreachable code due to shouldRun being false at runtime");
            }
        }
    }

    private boolean getCondition() {
        return false; // This method can be modified to return true/false based on runtime logic
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