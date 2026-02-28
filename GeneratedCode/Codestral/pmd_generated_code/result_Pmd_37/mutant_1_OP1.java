import java.util.Random;

class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // Introducing a dead store mutation
            int unusedVariable = generateRandomVariable();
            // BUG: DoNotThrowExceptionInFinally
            throw new Exception("Throwing exception in finally block");
        }
    }

    private int generateRandomVariable() {
        Random random = new Random();
        return random.nextInt();
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