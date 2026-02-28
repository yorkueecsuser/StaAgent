import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        double randomValue = random.nextDouble(); // Generates a random value between 0.0 and 1.0
        int coercedValue = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) { // Unreachable branch
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println("This statement is always executed.");
        }

        return coercedValue;
    }

    private boolean getUnreachableCondition() {
        // This condition will always return false, ensuring the if-else branch is unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}