class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            throw new Exception("Throwing exception in finally block");

            // Mutant: Unreachable if-else statement
            if (shouldRunElse()) {
                System.out.println("Unreachable code block");
            } else {
                // This code block is unreachable and would never be executed
                int x = 10 / 0;  // This line will cause an ArithmeticException if executed
            }
        }
    }

    private boolean shouldRunElse() {
        return false;
    }

    public static void main(String[] args) {
        BuggyClass bc = new BuggyClass();
        try {
            bc.showBug();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}