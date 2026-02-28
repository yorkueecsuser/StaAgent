import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Introduced loop for demonstration purposes
        int counter = 0;
        while (counter < 1) {
            counter++;
        }

        // Equivalent Loop Replacement Mutation
        int mutatedCounter = 0;
        do {
            mutatedCounter++;
        } while (mutatedCounter < 1);

        return result;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}