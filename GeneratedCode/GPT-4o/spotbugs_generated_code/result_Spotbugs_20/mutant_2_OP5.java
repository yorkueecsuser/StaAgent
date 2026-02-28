import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        double randomValue = random.nextDouble(); // Generates a random value between 0.0 and 1.0
        int coercedValue = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Unreachable switch statement
        int unreachableCondition = unreachableValue();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }

        return coercedValue;
    }

    // Method to simulate a condition that makes the switch statement unreachable
    private int unreachableValue() {
        return 0; // Always returns 0, ensuring the case condition is never met
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}