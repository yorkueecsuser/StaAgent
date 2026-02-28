import java.util.Random;

class RandomBug {
    private Random random = new Random(); // Moved the Random object out of the method to avoid creating a new object each time

    public int generateRandomNumber() {
        boolean unreachableCondition = false; // Unreachable condition
        while (unreachableCondition) {
            // This loop is unreachable
        }
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}