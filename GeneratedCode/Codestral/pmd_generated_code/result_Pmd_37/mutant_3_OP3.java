class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            throw new Exception("Throwing exception in finally block");

            // Mutant code - Unreachable if statement
            if (getFalseCondition()) {
                // This code is unreachable
                System.out.println("This is an unreachable if statement");
            }
        }
    }

    private boolean getFalseCondition() {
        return false;
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