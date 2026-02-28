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
            // Inserting a dead store (unused variable) as per the mutation operator
            int abcdefgh = 10;
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}