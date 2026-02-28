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
            // Unreachable if-else branch
            boolean isUnreachable = getUnreachableCondition();
            if (isUnreachable) {
                System.out.println("This will never be printed because condition is always false.");
            } else {
                System.out.println("This is the else block of unreachable if statement.");
            }
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    // Method to simulate an always false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}