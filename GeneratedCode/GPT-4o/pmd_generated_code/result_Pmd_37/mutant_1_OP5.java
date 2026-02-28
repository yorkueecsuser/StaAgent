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
            
            // Inserting an unreachable switch statement
            int unreachableSwitchCondition = getUnreachableSwitchCondition();
            switch (unreachableSwitchCondition) {
                case 1:
                    System.out.println("Unreachable case 1");
                    break;
                case 2:
                    System.out.println("Unreachable case 2");
                    break;
                default:
                    System.out.println("Unreachable default case");
            }
        }
    }

    private int getUnreachableSwitchCondition() {
        // This function always returns 0, making the switch cases unreachable
        return 0;
    }

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}