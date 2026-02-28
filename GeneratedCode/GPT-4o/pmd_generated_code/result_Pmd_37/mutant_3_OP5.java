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
            // Unreachable switch statement mutation
            int unreachableVariable = getUnreachableValue();
            switch (unreachableVariable) {
                case 1:
                    System.out.println("This case is unreachable.");
                    break;
                default:
                    // No operation
                    break;
            }
            
            // Throwing an exception in finally block which is a bad practice
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
    }

    // Method to ensure the switch condition is always false, making it unreachable
    private int getUnreachableValue() {
        return 2; // Ensures the switch case '1' is never executed
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}