class ExceptionInFinallyDemo {

    public void showBug() {
        try {
            // Simulating some operation that could throw an exception
            System.out.println("Performing an operation...");
            if (Math.random() > 0.5) {
                throw new RuntimeException("Operation failed!");
            }
            // Inserting unreachable for loop using a dynamically determined condition
            boolean conditionFor = getConditionFor();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is an unreachable for loop inside try block.");
            }
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    // Method to provide a non-final condition for the for loop
    private boolean getConditionFor() {
        return false; // This makes the for loop condition always false at runtime
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}