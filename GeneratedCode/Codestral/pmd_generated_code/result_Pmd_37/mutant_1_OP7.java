class BuggyClass {
    public boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            boolean conditionWhile = getUnreachableCondition();
            while (conditionWhile) {
                // Unreachable code
                System.out.println("This line should never be executed.");
            }
            // BUG: DoNotThrowExceptionInFinally
            throw new Exception("Throwing exception in finally block");
        }
    }

    public static void main(String[] args) {
        BuggyClass bc = new BuggyClass();
        try {
            bc.showBug();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}