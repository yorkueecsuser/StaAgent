class ExceptionInFinallyDemo {

    public void showBug() {
        try {
            // Simulating some operation that could throw an exception
            System.out.println("Performing an operation...");
            if (Math.random() > 0.5) {
                throw new RuntimeException("Operation failed!");
            }

            // Inserting an unreachable if statement
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            }
            
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    private boolean getFalseCondition() {
        // Method that always returns false
        return false;
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}