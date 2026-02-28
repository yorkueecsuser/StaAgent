import java.util.Random;

class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // Original code: DoNotThrowExceptionInFinally
            boolean shouldThrow = getRandomCondition();
            if (shouldThrow) {
                // Mutant Code: Unreachable if-else statement
                throw new Exception("Throwing exception in finally block");
            } else {
                // Alternative code path to avoid unreachable statement error
                System.out.println("Unreachable code path executed");
            }
        }
    }

    private boolean getRandomCondition() {
        // Generate a random boolean condition
        Random random = new Random();
        return random.nextBoolean();
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