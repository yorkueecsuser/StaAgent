import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed
            result = 42; // Unique code to demonstrate the insertion
        } else {
            // This block will also never be executed
            result = 24; // Unique code to demonstrate the insertion
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}