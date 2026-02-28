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
            // Introducing an unreachable if-else branch
            boolean condition = getCondition(); // This condition is always false at runtime
            if (condition) {
                System.out.println("Unreachable code block reached!"); // This will never be executed
            } else {
                System.out.println("Executing else branch in finally block.");
            }
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // Original code retained
        }
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}