import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Mutant: Unreachable if-else statement
        boolean shouldRun = false; // This variable ensures the if-else block is unreachable but not due to a compile-time constant
        if (shouldRun) {
            result = 42; // This line is unreachable
        } else {
            result = 24; // This line is also unreachable
        }

        return result;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}