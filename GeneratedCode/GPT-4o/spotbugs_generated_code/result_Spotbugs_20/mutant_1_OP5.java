import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        double randomValue = random.nextDouble(); // Generates a random value between 0.0 and 1.0
        int coercedValue = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        
        // Adding an unreachable switch statement
        int unreachableValue = random.nextInt(100) + 1; // Ensures this is not a compile-time constant
        switch (unreachableValue) { // This switch is always evaluated to false, hence unreachable
            case 101: // Intentionally a case that will never match
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case, but we'll ensure it's unreachable
                break;
        }

        return coercedValue;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}