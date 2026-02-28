class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
            String message = e.getMessage();
            String messageDuplicate = e.getMessage();  // Mutated code: Duplication of assignment statement
            System.out.println(message);
        } finally {
            // Bug: DoNotThrowExceptionInFinally
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