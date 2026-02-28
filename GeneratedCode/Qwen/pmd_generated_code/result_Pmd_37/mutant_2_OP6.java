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
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because conditionFor is always false
            }
            throw new RuntimeException("Exception from finally block"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    public static void main(String[] args) {
        FinallyBlockException example = new FinallyBlockException();
        try {
            example.showBug();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    private boolean getCondition() {
        return false;
    }
}