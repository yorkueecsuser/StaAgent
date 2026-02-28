import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        double randomValue = random.nextDouble(); // Generates a random value between 0.0 and 1.0
        int coercedValue = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable");
        }

        return coercedValue;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}