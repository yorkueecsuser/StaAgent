import java.lang.Exception;

class BuggyClass {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // Unreachable while loop inserted by mutation operator
                // This is an unreachable block of code meant to simulate a mutation
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