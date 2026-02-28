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
            // Original line which throws an exception in finally block
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
            
            // Duplicated line to follow mutation operator 'Duplication'
            throw new RuntimeException("Exception in finally block!"); // Duplicated line
        }
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}