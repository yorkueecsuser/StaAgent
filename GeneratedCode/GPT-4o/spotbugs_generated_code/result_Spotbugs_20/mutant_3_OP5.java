import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        double randomValue = random.nextDouble(); // Generates a random value between 0.0 and 1.0
        int coercedValue = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method ensures the switch is unreachable
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            case 2:
                System.out.println("This is also unreachable");
                break;
            default:
                // Default case is also unreachable
                System.out.println("Default unreachable");
                break;
        }

        return coercedValue;
    }

    // Method to get a value that makes the switch unreachable
    private int getUnreachableValue() {
        return 3; // This value is not handled by the switch cases above
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}