class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // Original Bug: DoNotThrowExceptionInFinally
            throw new Exception("Throwing exception in finally block");
        }

        // Inserted Mutant: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is always executed");
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