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
            
            // Inserting an unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because the exception is thrown before it
                System.out.println("Unreachable loop iteration: " + i);
            }
        }
    }

    private boolean getCondition() {
        // This method returns false to ensure the loop is unreachable
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