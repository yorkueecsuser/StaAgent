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
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}

// Mutant Code
class ExceptionInFinallyDemo_mutant {

    public void showBug() {
        try {
            // Simulating some operation that could throw an exception
            System.out.println("Performing an operation...");
            if (Math.random() > 0.5) {
                throw new RuntimeException("Operation failed!");
            }
        } catch (Exception f) { // Variable 'e' renamed to 'f'
            System.out.println("Caught an exception: " + f.getMessage());
        } finally {
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo_mutant demo = new ExceptionInFinallyDemo_mutant();
        demo.showBug();
    }
}