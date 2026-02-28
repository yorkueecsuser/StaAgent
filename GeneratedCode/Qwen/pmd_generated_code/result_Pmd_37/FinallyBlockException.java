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
        }
    }

    // Mutated code with renaming
    public String showBugMutated() {
        try {
            // Simulate some operation that might throw an exception
            int a = 10 / 0; // This will throw an ArithmeticException
            return String.valueOf(a);
        } catch (ArithmeticException b) {
            // Handle the arithmetic exception
            System.out.println("Caught ArithmeticException: " + b.getMessage());
            return "Handled ArithmeticException";
        } finally {
            // Throwing an exception in the finally block
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

        // Testing mutated method
        try {
            example.showBugMutated();
        } catch (RuntimeException f) {
            System.out.println("Caught RuntimeException: " + f.getMessage());
        }
    }
}