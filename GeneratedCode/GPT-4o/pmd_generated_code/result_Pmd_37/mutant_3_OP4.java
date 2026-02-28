class ExceptionInFinallyDemo {

    public void showBug() {
        try {
            // Simulating some operation that could throw an exception
            System.out.println("Performing an operation...");
            if (Math.random() > 0.5) {
                throw new RuntimeException("Operation failed!");
            }
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
        
        // Inserting an unreachable if-else statement
        boolean condition = determineCondition(); // Always returns false
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the alternative branch.");
        }
    }

    // A helper method to ensure condition is always false
    private boolean determineCondition() {
        return false;
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}