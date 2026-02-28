import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            result = 999; // Unique value to indicate this block is executed
        } else {
            // This block will always execute
            result = result * 10; // Just an example operation to maintain the structure
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}