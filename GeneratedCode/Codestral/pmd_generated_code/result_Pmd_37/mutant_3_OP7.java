class BuggyClass {
    private static boolean getFalseCondition() {
        return false;
    }

    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            throw new Exception("Throwing exception in finally block");

            // Mutant: Unreachable while loop
            while (getFalseCondition()) {
                // This code is unreachable
                System.out.println("Unreachable code");
            }
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