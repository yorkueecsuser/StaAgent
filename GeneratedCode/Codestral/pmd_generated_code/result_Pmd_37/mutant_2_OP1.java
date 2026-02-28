import java.util.Random;

class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // Dead store mutation
            int unusedVariable = generateRandomNumber();

            // Original code
            throw new Exception("Throwing exception in finally block");
        }
    }

    // Utility method to generate a random number
    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(1000);
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